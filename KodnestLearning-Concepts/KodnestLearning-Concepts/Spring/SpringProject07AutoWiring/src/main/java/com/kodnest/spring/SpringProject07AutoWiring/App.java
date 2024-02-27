package com.kodnest.spring.SpringProject07AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
    	University uniObj=(University)ctx.getBean("uni");
        System.out.println(uniObj);
    }
}
