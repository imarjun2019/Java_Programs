package com.first;


import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class MainLogic {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("configure.xml");        
        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();
        
        Student x = new Student();
        x.setSid(1023);
        x.setName("rahul");
        x.setPhone(8878876789l);
        
        Transaction tx = se.beginTransaction();
        
        se.save(x);
        
        tx.commit();
        
        se.close();
        sf.close();
        
        
    }
}
