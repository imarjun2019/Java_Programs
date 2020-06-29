package com.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        PlayersDao pl = (PlayersDao)ac.getBean("player");
        
        Players p = new Players();
        p.setId(101);
        p.setName("Arjun");
        p.setSalary(12000);
        pl.savePlayers(p);

        
        //Players p =pl.getPlayers(102);
        //System.out.printf("%d %s %.3f",p.getId(),p.getName(),p.getSalary());



    }


    
    


}
