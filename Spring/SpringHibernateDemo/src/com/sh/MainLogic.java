package com.sh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        PlayersDao pd = (PlayersDao)ac.getBean("player");
        Players pl = new Players();
        pl.setId(102);
        pl.setName("Arjun");
        pl.setSalary(100000);
        pd.savePlayers(pl);


    }


    
    


}
