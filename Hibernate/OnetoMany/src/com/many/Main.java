package com.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("Configure.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();

        Transaction tx = se.beginTransaction();

        // Insertion for Map
        Vendor v = new Vendor();
        v.setId(101);
        v.setName("Aston Martin");

        Customer c = new Customer();
        c.setCid(201);
        c.setName("Johnson");

        Customer c1 = new Customer();
        c1.setCid(202);
        c1.setName("Steyn");

        Customer c2 = new Customer();
        c2.setCid(203);
        c2.setName("Bumrah");

        Customer c3 = new Customer();
        c3.setCid(204);
        c3.setName("Malinga");

        Map s = new HashMap();
        s.put("Customer",c);
        s.put("Customer1",c1);
        s.put("Customer2",c2);
        s.put("Customer3",c3);
        v.setX(s);
        se.save(v);

    /*
        // Insertion for Set
        Vendor v = new Vendor();
        v.setId(101);
        v.setName("Aston Martin");

        Customer c = new Customer();
        c.setCid(201);
        c.setName("Johnson");

        Customer c1 = new Customer();
        c1.setCid(202);
        c1.setName("Steyn");

        Customer c2 = new Customer();
        c2.setCid(203);
        c2.setName("Bumrah");

        Customer c3 = new Customer();
        c3.setCid(204);
        c3.setName("Malinga");

        Set s = new HashSet();
        s.add(c);
        s.add(c1);
        s.add(c2);
        s.add(c3);
        v.setX(s);
        se.save(v);

     */

    /*
        // Insertion for List
        Vendor v = new Vendor();
        v.setId(101);
        v.setName("Aston Martin");

        Customer c = new Customer();
        c.setCid(201);
        c.setName("Johnson");

        Customer c1 = new Customer();
        c1.setCid(202);
        c1.setName("Steyn");

        Customer c2 = new Customer();
        c2.setCid(203);
        c2.setName("Bumrah");

        Customer c3 = new Customer();
        c3.setCid(204);
        c3.setName("Malinga");

        List s = new ArrayList();
        s.add(c);
        s.add(c1);
        s.add(c2);
        s.add(c3);
        v.setX(s);
        se.save(v);

     */



        /*

        //Delete
        Object o = se.get(Vendor.class,101);
        Vendor v = (Vendor)o;

        se.delete(v);

         */

        /*
        //Select
        Object o = se.get(Vendor.class,101);
        Vendor v = (Vendor)o;
        System.out.println(v.getId() + " " + v.getName());


        Set x = v.getX();
        Iterator li = x.iterator();
        while (li.hasNext())
        {
            Object ob = (Object)li.next();
            Customer c = (Customer)ob;
            System.out.println(c.getCid() + " " + c.getName() + " " + c.getFkey());
        }

         */


        tx.commit();

        se.close();
        sf.close();
    }
}
