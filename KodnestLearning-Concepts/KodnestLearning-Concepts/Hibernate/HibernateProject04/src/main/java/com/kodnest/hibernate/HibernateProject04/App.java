package com.kodnest.hibernate.HibernateProject04;

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
        
        Bike b1=new Bike(111,"KTM",200000);
    	Bike b2=new Bike(222,"BMW",300000);
    	Bike b3=new Bike(333,"Jawa",350000);
        
        Person p1=new Person(1,"Sanjib",23,b1);
    	Person p2=new Person(2,"Sangita",20,b2);
    	Person p3=new Person(3,"Rithvi",24,b3);
    	
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
