package com.kodnest.spring.SpringProject04Wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
    	Employee emp1Obj = (Employee)ctx.getBean("emp1");
    	CompanyXYZ cmpObj =(CompanyXYZ)ctx.getBean("cmp");
    	
        System.out.println(emp1Obj);
        System.out.println(cmpObj);
    }
}
