package com.jdbc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig2.xml");
        PlayersDao x = (PlayersDao)ac.getBean("players");

        // Insertion
        Players p = new Players();
        p.setPid(105);
        //p.setName("Malinga");
        //p.setCountry("India");
        //p.setTeam("Mumbai");

        Boolean k = x.insertPlayers(p);
        if(k)
            System.out.println("Record Deleted");
    }
}
