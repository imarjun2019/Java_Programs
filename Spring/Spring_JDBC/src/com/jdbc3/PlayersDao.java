package com.jdbc3;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class PlayersDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void getAll()
    {
        List l = jdbcTemplate.queryForList("select * from players where name like 'B%'");
        Iterator it = l.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }


}
