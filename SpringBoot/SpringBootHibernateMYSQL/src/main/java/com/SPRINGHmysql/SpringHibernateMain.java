package com.SPRINGHmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateMain implements CommandLineRunner {
	
	@Autowired
	private PlayersDao playersDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateMain.class,args);
	}

	public void run(String[] args) throws Exception {
		Players players = getPlayers();
		playersDao.createPlayers(players);
		
//	@Override--
//	public void run(String[] args) throws Exception {
//		Players players = getPlayers();
//		PlayersDao.createPlayers(players);
//	}
//	private Players getPlayers() {
//		Players players = new Players();
//		players.setName("Shiva");
//		players.setSpeciality("Football");
//		
//		return players;
		
		
	}

	private Players getPlayers() {
		// TODO Auto-generated method stub
		Players players = new Players();
		players.setName("Shiva");
		players.setSpeciality("Football");
		
		return players;
	}
		

}


