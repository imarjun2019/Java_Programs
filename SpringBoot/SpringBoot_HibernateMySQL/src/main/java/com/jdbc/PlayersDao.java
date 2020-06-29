package com.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlayersDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void createPlayers(Players players)
    {
        Session session = null;
        try
        {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Integer id = (Integer) session.save(players);
            System.out.printf("Player with id %d is created",id);
            session.getTransaction().commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
