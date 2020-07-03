package com.config;

import com.model.Bikes;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Bean
    public DataSource dataSource()
    {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sboot");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }


    @Bean
    public JdbcCursorItemReader<Bikes> reader()
    {
        JdbcCursorItemReader<Bikes> reader = new JdbcCursorItemReader<Bikes>();
        reader.setDataSource(dataSource);
        reader.setSql("Select id,name,model,milage from bikes");
        reader.setRowMapper(new BikesRowMapper());

        return reader;
    }

    public class BikesRowMapper implements RowMapper<Bikes>
    {

        @Override
        public Bikes mapRow(ResultSet resultSet, int i) throws SQLException {
            Bikes bikes = new Bikes();
            bikes.setId(resultSet.getInt("id"));
            bikes.setName(resultSet.getString("name"));
            bikes.setModel(resultSet.getString("model"));
            bikes.setMilage(resultSet.getDouble("milage"));

            return bikes;
        }
    }

    @Bean
    public BikeProcessor processor()
    {
        return new BikeProcessor();
    }

    @Bean
    public FlatFileItemWriter<Bikes> writer(){
        FlatFileItemWriter<Bikes> writer = new FlatFileItemWriter<Bikes>();
        writer.setResource(new ClassPathResource("bikes.csv"));
        writer.setLineAggregator(new DelimitedLineAggregator<Bikes>()
        {
            {
            setDelimiter(",");
            setFieldExtractor(new BeanWrapperFieldExtractor<Bikes>()
            {
                {
                setNames(new String[] { "id", "name","model","milage" });
                }
            });
        }
        });

        return writer;
    }

    @Bean
    public Step step1()
    {
        return stepBuilderFactory.get("step1").<Bikes,Bikes> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

    @Bean
    public Job exportBikesJob()
    {
        return jobBuilderFactory.get("exportBikesJob")
                .incrementer(new RunIdIncrementer())
                .flow(step1())
                .end()
                .build();
    }

}
