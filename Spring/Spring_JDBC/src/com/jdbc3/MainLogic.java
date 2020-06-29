package com.jdbc3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig3.xml");
        PlayersDao x = (PlayersDao)ac.getBean("players");

        x.getAll();
    }
}
