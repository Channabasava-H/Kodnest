package com.kodnest.hibernate.HibernateProject01;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg =new Configuration();
    	cfg.configure(); 
    	SessionFactory factory=cfg.buildSessionFactory();
    	System.out.println(factory);
    	
        System.out.println( "Hibernate is working" );
    }
}


//Mapping

//One to One Mapping
//One to Many or many to one mapping
//Many to many mapping

//CRUD