package com.kodnest.spring.SpringProject03;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
      Employee empObj1 =(Employee)ctx.getBean("emp1");
      System.out.println(empObj1);
    }
}
