package com.product;

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

        /*
        Product p = new Product();

        p.setPid(10);
        p.setName("Amino KEM");
        p.setPrice(150);
        p.setCompany("Evogen");
        Transaction tx = se.beginTransaction();
        se.save(p);
        tx.commit();
         */
        /*
            The main difference between the get() method and load() method is that the get() method returns the null
            object if the object is not found, whereas the load() method will throw the exception if object not found.

            If we are not sure if the object exists ot not, then we should use the get() method, else if known about the
            existence of the object, we should or can use the load method.
         */

        Object o = se.load(Product.class,7);
        Product p = (Product)o;

        System.out.println("PID\tName\t\tPrice\tCompany ");
        System.out.printf("%d\t%s\t%d\t\t%s",p.getPid(),p.getName(),p.getPrice(),p.getCompany());



        se.close();
        sf.close();


    }


}
