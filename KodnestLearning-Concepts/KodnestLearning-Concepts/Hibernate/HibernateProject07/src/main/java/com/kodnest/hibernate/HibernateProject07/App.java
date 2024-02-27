package com.kodnest.hibernate.HibernateProject07;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student st1=new Student();
    	Student st2=new Student();
    	Student st3=new Student();
    	
    	Laptop lp1=new Laptop();
    	Laptop lp2=new Laptop();
    	Laptop lp3=new Laptop();
    	Laptop lp4=new Laptop();
    	Laptop lp5=new Laptop();
    	Laptop lp6=new Laptop();
    	Laptop lp7=new Laptop();
    	
    	List<Laptop> lpList1=new ArrayList<Laptop>();
    	lpList1.add(lp2);
    	lpList1.add(lp4);
    	List<Laptop> lpList2=new ArrayList<Laptop>();
    	lpList2.add(lp1);
    	lpList2.add(lp3);
    	lpList2.add(lp6);
    	List<Laptop> lpList3=new ArrayList<Laptop>();
    	lpList3.add(lp5);
    	lpList3.add(lp7);
    	
    	st1.setS_RollNo(1);
    	st1.setS_Name("Rohit");
    	st1.setL_id(lpList1);
    	
    	st2.setS_RollNo(2);
    	st2.setS_Name("Suraj");
    	st2.setL_id(lpList2);
    	
    	st3.setS_RollNo(3);
    	st3.setS_Name("Monoj");
    	st3.setL_id(lpList3);
    	
    	lp1.setS_SrNo(1223);
    	lp1.setL_Brand("HP");
    	lp1.setSt(st2);
    	
    	lp2.setS_SrNo(1224);
    	lp2.setL_Brand("Lenovo");
    	lp2.setSt(st1);
    	
    	lp3.setS_SrNo(1225);
    	lp3.setL_Brand("Dell");
    	lp3.setSt(st2);
    	
    	lp4.setS_SrNo(1226);
    	lp4.setL_Brand("Asus");
    	lp4.setSt(st1);
    	
    	lp5.setS_SrNo(1227);
    	lp5.setL_Brand("Mac");
    	lp5.setSt(st3);
    	
    	lp6.setS_SrNo(1228);
    	lp6.setL_Brand("Acer");
    	lp6.setSt(st2);
    	
    	lp7.setS_SrNo(1229);
    	lp7.setL_Brand("Mi");
    	lp7.setSt(st3);
    	
       Configuration cfg=new Configuration().configure();
       SessionFactory factory = cfg.buildSessionFactory();
       Session session=factory.openSession();
       Transaction trx =session.beginTransaction();
       session.save(st1);
       session.save(st2);
       session.save(st3);
       session.save(lp1);
       session.save(lp2);
       session.save(lp3);
       session.save(lp4);
       session.save(lp5);
       session.save(lp6);
       session.save(lp7);
       trx.commit();
       System.out.println("Data Stored Successfully!");
    }
}
