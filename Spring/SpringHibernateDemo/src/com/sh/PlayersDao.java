package com.sh;
//This is a dao class of and now you have to write springconfig.xml
import org.springframework.orm.hibernate3.HibernateTemplate;

public class PlayersDao {
    HibernateTemplate ht;

    public void setHt(HibernateTemplate ht)
    {
        this.ht=ht;
    }
    public void savePlayers(Players p)
    {
        ht.save(p);
    }
    public void updatePlayers(Players p)
    {
        ht.update(p);
    }
    public void deletePlayers(Players p)
    {
        ht.delete(p);
    }
    public Players getDetails(int id)
    {
        Players p = (Players)ht.get(Players.class,id);
        return p;
    }

}
