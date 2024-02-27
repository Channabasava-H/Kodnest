package com.kodnest.hibernate.HibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//Not Completed

public class App 
{
    public static void main( String[] args )
    {
       //create();
       //fetchdata();
       updateData();
       //deteleData();
       
    }

	

	private static void create() {
		Configuration cfg=new Configuration().configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction trx= session.beginTransaction();
		
		Person per1=new Person(11,"Sumit",24,"sumit@gmail.com",1234567890);
		Person per2=new Person(12,"Rohit",25,"rohit@gmail.com",1234500000);
		session.save(per1);
		session.save(per2);
		trx.commit();
		System.out.println("Data Stored.");
	}
	
	private static void fetchdata() {
		Configuration cfg=new Configuration().configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction trx= session.beginTransaction();
		
		Person pr=session.get(Person.class, 11);
		
		trx.commit();
		System.out.println(pr);
	}
	
	private static void deteleData() {
		
		Configuration cfg=new Configuration().configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction trx= session.beginTransaction();
		
		
		
		session.delete("Ajay");
		
		trx.commit();
		
	}

	private static void updateData() {
		
		Configuration cfg=new Configuration().configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction trx= session.beginTransaction();
		
		Person per =new Person(12,"Ajay",20,"samar@gmail.com",1112334556);
		session.update(per);
		//Not Completed
		
		trx.commit();
		System.out.println("Update Successful.");
	}
	
}
