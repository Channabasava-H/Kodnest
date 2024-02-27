package com.kodnest.spring.SpringProject06AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
    	Car carObj=(Car)ctx.getBean("car");
        System.out.println(carObj);
    }
}
