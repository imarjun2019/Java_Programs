package com.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class PlayersDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insertPlayers (Players p)
    {
        String query = "insert into players values ("+p.getPid()+",'"+p.getName()+"','"+p.getTeam()+"','"+p.getCountry()+"')";
        int x = jdbcTemplate.update(query);
        return x;
    }

    public int updatePlayers(Players p)
    {
        String query = "update players set name='"+p.getName()+"' where pid = "+p.getPid()+"";
        int x = jdbcTemplate.update(query);
        return x;
    }

    public int deletePlayers(Players p)
    {
        String query = "delete from players where pid = " +p.getPid()+"" ;
        int x = jdbcTemplate.update(query);
        return x;
    }
}
