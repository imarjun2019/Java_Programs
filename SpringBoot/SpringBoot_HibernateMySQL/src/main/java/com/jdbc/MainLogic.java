package com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MainLogic implements CommandLineRunner {
    @Autowired
    private PlayersDao playersDao;
    public static void main(String[] args) {

        SpringApplication.run(MainLogic.class,args);

    }

    @Override
    public void run(String[] args) throws Exception {
        Players players = getPlayers();
        playersDao.createPlayers(players);

    }

    private Players getPlayers()
    {
        Players players = new Players();
        players.setName("Arjun");
        players.setTeam("KTM");
        players.setCountry("Nepal");

        return players;
    }
}
