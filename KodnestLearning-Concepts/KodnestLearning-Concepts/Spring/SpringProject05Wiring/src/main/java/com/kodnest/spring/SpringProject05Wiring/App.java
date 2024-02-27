package com.kodnest.spring.SpringProject05Wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
    	Person perObjc =(Person)ctx.getBean("per");
        System.out.println(perObjc);
    }
}
