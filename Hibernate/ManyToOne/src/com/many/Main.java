package com.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("Configure.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();

        Transaction tx = se.beginTransaction();


        Vendor v = new Vendor();
        v.setId(101);
        v.setName("Rolls Royce");

        Customer c = new Customer();
        c.setCid(201);
        c.setName("Warner");
        c.setV(v);

        Customer c1 = new Customer();
        c1.setCid(202);
        c1.setName("De Villers");
        c1.setV(v);

        Customer c2 = new Customer();
        c2.setCid(203);
        c2.setName("Pandya");
        c2.setV(v);

        Customer c3 = new Customer();
        c3.setCid(204);
        c3.setName("Pollard");
        c3.setV(v);


        se.save(c);
        se.save(c1);
        se.save(c2);
        se.save(c3);




        tx.commit();

        se.close();
        sf.close();
    }
}
