package com.leagues;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();


        //Query qr = se.createQuery("from Leagues l");
        //Query qr = se.createQuery("insert into Dleagues (did,dname,dcountry,dtotal_teams) select lid,name,country,total_teams from Leagues where lid=:value");
        //Query qr = se.createQuery("delete from Leagues l where l.lid=:value");
        //qr.setParameter("value",5);
        //qr.setParameter("value2",1);
        //qr.executeUpdate();

        //Query qr = se.createQuery("from Leagues l where l.country like 'N%'");
//        Query qr = se.createQuery("from Leagues l where l.total_teams between ? and ?");
//        qr.setParameter(0,8);
//        qr.setParameter(1,10);


        Criteria ct = se.createCriteria(Leagues.class);
        //ct.add(Restrictions.like("country","N%"));
        //ct.addOrder(Order.asc("total_teams"));
        //ct.addOrder(Order.desc("lid"));

        Criterion cx = Restrictions.gt("total_teams",7);
        ct.add(cx);

        List l = ct.list();
        Iterator li = l.iterator();
        //System.out.println("LID\tLeagueName\tCountry\t  TotalTeams");


        while (li.hasNext())
        {
            //Integer o = (Integer) li.next();
            Object o = (Object)li.next();
           Leagues le = (Leagues)o;
           System.out.printf("%d\t%3s\t%13s\t%5d\n",le.getLid(),le.getName(),le.getCountry(),le.getTotal_teams());
            //System.out.println(o.intValue());

        }


        Transaction tx = se.beginTransaction();

       tx.commit();


        se.close();
        sf.close();

    }
}
