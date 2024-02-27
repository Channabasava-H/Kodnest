package com.kodnest.spring.SpringProject02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Laptop lpObj1=(Laptop)ctx.getBean("lp1");
        Laptop lpObj2=(Laptop)ctx.getBean("lp2");
        System.out.println(lpObj1);
        System.out.println(lpObj2);
    }
}
