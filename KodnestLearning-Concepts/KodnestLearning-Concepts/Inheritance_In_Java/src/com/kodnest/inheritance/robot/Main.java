package com.kodnest.inheritance.robot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Robot r=new Robot();
		
		System.out.println("Chef Robot");
		ChefRobot cr=new ChefRobot();
		cr.talk();
		cr.walk();
		cr.charge();
		cr.cook();
		
		System.out.println("===========");
		
		System.out.println("Doctor Robot");
		DoctorRobot dr=new DoctorRobot();
		dr.talk();
		dr.walk();
		dr.charge();
		dr.surgery();
		
		System.out.println("===========");
		
		System.out.println("Teacher Robot");
		TeacherRobot tr=new TeacherRobot();
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();

	}

}
