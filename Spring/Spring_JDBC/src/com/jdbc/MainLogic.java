package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        PlayersDao x = (PlayersDao)ac.getBean("players");

        // Insertion
        Players p = new Players();
        p.setPid(105);
        p.setName("Dhoni");
        p.setCountry("India");
        p.setTeam("Chennai");

        int k = x.insertPlayers(p);
        if(k!=0)
            System.out.println("Record Inserted");

        // Update
        Players p1 = new Players();
        p1.setPid(101);
        p1.setName("Jhonty");

        int l = x.updatePlayers(p1);
        if(l!=0)
            System.out.println("Record Updated");

        //Delete
        Players p2 = new Players();
        p2.setPid(105);

        int m = x.deletePlayers(p2);
        if (m!=0)
        System.out.println("Record Deleted");

    }
}
