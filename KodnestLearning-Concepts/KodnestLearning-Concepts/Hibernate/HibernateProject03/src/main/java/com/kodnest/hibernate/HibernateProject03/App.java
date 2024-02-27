package com.kodnest.hibernate.HibernateProject03;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session1 = factory.openSession();
    	Transaction tr1=session1.beginTransaction();
    	System.out.println(factory);
    	Person p1=new Person(1,"Sanjib",23);
    	session1.save(p1);
    	Person p2=new Person(2,"Sangita",20);
    	session1.save(p2);
    	Person p3=new Person(3,"Rithvi",24);
    	session1.save(p3);
    	Bike b1=new Bike(111,"KTM",200000);
    	session1.save(b1);
    	Bike b2=new Bike(222,"BMW",300000);
    	session1.save(b2);
    	Bike b3=new Bike(333,"Jawa",350000);
    	session1.save(b3);
    	tr1.commit();
        System.out.println( "Successful..!" );
    }
}
