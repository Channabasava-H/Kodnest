package com.kodnest.spring.SpringProject01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Student stobj = (Student)ctx.getBean("st");
    	JavaTeacher jtobj= (JavaTeacher)ctx.getBean("jt");
    	SqlTeacher sqtobj=(SqlTeacher)ctx.getBean("sqt");
    	PythonTeacher pytobj= (PythonTeacher)ctx.getBean("pt");
        System.out.println(stobj);
        System.out.println(jtobj);
        System.out.println(sqtobj);
        System.out.println(pytobj);
        
    }
}
