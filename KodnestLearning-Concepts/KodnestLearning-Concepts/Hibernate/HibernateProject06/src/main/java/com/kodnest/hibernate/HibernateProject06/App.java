package com.kodnest.hibernate.HibernateProject06;

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
    	Technology tech1=new Technology();
    	Technology tech2=new Technology();
    	Technology tech3=new Technology();
    	Technology tech4=new Technology();
    	
    	SoftwareEng se1=new SoftwareEng();
    	SoftwareEng se2=new SoftwareEng();
    	SoftwareEng se3=new SoftwareEng();
    	
    	List<Technology> t_list1 = new ArrayList<Technology>();
    	t_list1.add(tech1);
    	t_list1.add(tech2);
    	List<Technology> t_list2 = new ArrayList<Technology>();
    	t_list2.add(tech1);
    	t_list2.add(tech2);
    	t_list2.add(tech3);
    	t_list2.add(tech4);
    	List<Technology> t_list3 = new ArrayList<Technology>();
    	t_list3.add(tech1);
    	t_list3.add(tech4);
    	
    	
    	List<SoftwareEng> se_list1 = new ArrayList<SoftwareEng>();
    	se_list1.add(se1);
    	se_list1.add(se2);
    	se_list1.add(se3);
    	List<SoftwareEng> se_list2 = new ArrayList<SoftwareEng>();
    	se_list2.add(se1);
    	se_list2.add(se2);
    	List<SoftwareEng> se_list3 = new ArrayList<SoftwareEng>();
    	se_list3.add(se2);
    	List<SoftwareEng> se_list4 = new ArrayList<SoftwareEng>();
    	se_list4.add(se2);
    	se_list4.add(se3);
    	
    	tech1.setT_id(123);
    	tech1.setT_name("Java");
    	tech1.setSe_id(se_list1);
    	
    	tech2.setT_id(124);
    	tech2.setT_name("HTML");
    	tech2.setSe_id(se_list2);
    	
    	tech3.setT_id(125);
    	tech3.setT_name("CSS");
    	tech3.setSe_id(se_list3);
    	
    	tech4.setT_id(126);
    	tech4.setT_name("SQL");
    	tech4.setSe_id(se_list4);
    	
    	
    	se1.setId(1);
    	se1.setName("Sumit");
    	se1.setAge(29);
    	se1.setTech_id(t_list1);
    	
    	se2.setId(2);
    	se2.setName("Saurav");
    	se2.setAge(30);
    	se2.setTech_id(t_list2);
    	
    	se3.setId(3);
    	se3.setName("Sachin");
    	se3.setAge(28);
    	se3.setTech_id(t_list3);
    	
    	Configuration cfg=new Configuration().configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session =factory.openSession();
    	Transaction trx = session.beginTransaction();
    	session.save(tech1);
    	session.save(tech2);
    	session.save(tech3);
    	session.save(tech4);
    	session.save(se1);
    	session.save(se2);
    	session.save(se3);
    	
    	trx.commit();
        System.out.println( "Completed...." );
    }
}
