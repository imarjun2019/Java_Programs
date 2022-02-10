package com.mysql.SpringBoot_Mysql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
	public class PlayersDao {
		@Autowired
		private SessionFactory sessionFactory;
		public void createPlayers(Players players) {
			Session session=null;
			try {
				session = sessionFactory.openSession();
				session.beginTransaction();
				Integer id = (Integer) session.save(players);
				System.out.println("Player is created with Id::"+id);
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
}