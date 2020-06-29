package com.jdbc2;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayersDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean insertPlayers (final Players p) {

        String query = "delete from players where pid=?";
        jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                //ps.setString(1,p.getName());
                //ps.setString(2,p.getTeam());
                ps.setInt(1,p.getPid());



                return ps.execute();
            }
        });
        return true;

    }
}
