package com.kodnest.polymorphism.downcasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer dev;
		
		dev=new BackEndDeveloper();
		//upcasting - assigning BackEndDeveloper object to Developer dev reference
		dev.project(); //calling inherited method 
		dev.attendMeeting(); //calling overridden method
		//performing downcasting - converting dev(parent ref) to BackEndDeveloper(child object)
		((BackEndDeveloper)(dev)).learnJava(); //calling child-specific method
		
		dev=new FrontEndDeveloper();
		//upcasting - assigning BackEndDeveloper object to Developer dev reference
		dev.project(); //calling inherited method 
		dev.attendMeeting(); //calling overridden method
		//performing downcasting - converting dev(parent ref) to BackEndDeveloper(child object)
		((FrontEndDeveloper)(dev)).learnHTML(); //calling child-specific method
		
		dev=new DatabaseDeveloper();
		//upcasting - assigning BackEndDeveloper object to Developer dev reference
		dev.project(); //calling inherited method 
		dev.attendMeeting(); //calling overridden method
		//performing downcasting - converting dev(parent ref) to BackEndDeveloper(child object)
		((DatabaseDeveloper)(dev)).learnSQL(); //calling child-specific method

	}

}
