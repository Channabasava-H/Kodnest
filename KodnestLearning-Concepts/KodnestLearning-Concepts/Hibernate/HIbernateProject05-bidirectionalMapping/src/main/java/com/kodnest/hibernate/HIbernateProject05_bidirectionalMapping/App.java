package com.kodnest.hibernate.HIbernateProject05_bidirectionalMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction trx=session.beginTransaction();
        
        Person p1=new Person();
    	Person p2=new Person();
    	Person p3=new Person();
    	
        Bike b1=new Bike(111,"KTM",200000,p1);
    	Bike b2=new Bike(222,"BMW",300000,p2);
    	Bike b3=new Bike(333,"Jawa",350000,p3);
        
    	p1.setP_id(1);
    	p1.setP_name("Sanjeeb");
    	p1.setP_age(23);
    	p1.setB(b1);;
    	p2.setP_id(2);
    	p2.setP_name("Rahul");
    	p2.setP_age(24);
    	p2.setB(b2);
    	p3.setP_id(3);
    	p3.setP_name("Yuvraj");
    	p3.setP_age(22);
    	p3.setB(b3);
    	
    	session.save(p1);
    	session.save(p2);
    	session.save(p3);
    	session.save(b1);
    	session.save(b2);
    	session.save(b3);
    	trx.commit();
    	System.out.println("Completed...");
    }
}
