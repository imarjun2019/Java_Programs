package com.jdbc;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;

@Configuration
public class HibernateConfig {

    @Autowired
    private EntityManagerFactory emf;

    @Bean
    public SessionFactory getSessionFactory()
    {
        if(emf.unwrap(SessionFactory.class)==null)
        {
            throw new NullPointerException("Factory is not a hibernate factory");
        }
        return emf.unwrap(SessionFactory.class);
    }
}
