package com.table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("configure.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();

        /*
        CreditCard cc = new CreditCard();
        cc.setPid(1);
        cc.setAmount(32000);
        cc.setCreditCardType("Amex");
        */
        
        
        
        Cheque cq = new Cheque();
        cq.setPid(2);
        cq.setAmount(54667);
        cq.setChequeType("Nabil");
        
        
        

        Transaction tx = se.beginTransaction();

        se.save(cq);

        tx.commit();

        se.close();
        sf.close();

    }
}
