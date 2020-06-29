package com.leagues;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();

        Leagues ipl = new Leagues();
        ipl.setName("IPL");
        ipl.setLid(1);
        ipl.setCountry("India");

        Transaction tx = se.beginTransaction();


        se.save(ipl);

        tx.commit();

        se.close();
        sf.close();

    }
}
