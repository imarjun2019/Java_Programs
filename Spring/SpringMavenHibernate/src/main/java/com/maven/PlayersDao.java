package com.maven;

//This is a dao class of and now you have to write springconfig.xml
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlayersDao {
SessionFactory sef;
Session se;
Transaction tx;

public void setSef(SessionFactory sef)
{
    this.sef=sef;
}
public void savePlayers(Players pl)
{
    se = sef.openSession();
    tx = se.beginTransaction();
    se.save(pl);
    tx.commit();
    se.close();
}

public Players getPlayers(int id)
{
    se=sef.openSession();
    Players p = (Players)se.get(Players.class,id);
    return p;

}

}
