package com.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("Configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();

        Student s1 = new Student();
        s1.setSid(101);
        s1.setName("Johnston");
        s1.setMarks(95);

        Student s2 = new Student();
        s2.setSid(102);
        s2.setName("Maria");
        s2.setMarks(90);

        Student s3 = new Student();
        s3.setSid(103);
        s3.setName("Jonny");
        s3.setMarks(85);

        Student s4 = new Student();
        s4.setSid(104);
        s4.setName("Nancy");
        s4.setMarks(99);

        Student s5 = new Student();
        s5.setSid(105);
        s5.setName("John");
        s5.setMarks(100);

        Course c1 = new Course();
        c1.setCid(201);
        c1.setCname("Archery");
        c1.setDuration(4);

        Course c2 = new Course();
        c2.setCid(202);
        c2.setCname("Shooting");
        c2.setDuration(10);

        Transaction tx = se.beginTransaction();

        Set s = new HashSet();

        s.add(c1);

        Set k = new HashSet();
        k.add(c2);

        s1.setCourses(s);
        s2.setCourses(s);
        s3.setCourses(k);
        s4.setCourses(k);
        s5.setCourses(s);

        se.save(s1);
        se.save(s2);
        se.save(s3);
        se.save(s4);
        se.save(s5);


        tx.commit();

        se.close();
        sf.close();



    }
}
