package com.One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("Configure.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();

        Transaction tx = se.beginTransaction();

        Employee emp = new Employee();
        emp.setEid(101);
        emp.setName("Henry");

        Eaddress ea = new Eaddress();
        ea.setAid(201);
        ea.setStreet("132 Old Alabama");
        ea.setCity("Alphareeta");
        ea.setState("Georgia");
        ea.setZipcode(30186);
        ea.setEmp(emp);
        se.save(ea);
        tx.commit();
    }
}
