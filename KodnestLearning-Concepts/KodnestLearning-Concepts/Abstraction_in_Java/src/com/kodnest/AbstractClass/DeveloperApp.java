package com.kodnest.AbstractClass;

public class DeveloperApp {
	
	static void doActivity(Developer ref)
	{
		ref.doProject();
		if(ref instanceof JavaDeveloper) 
		{
			((JavaDeveloper)ref).learnJava();
		}
		else if (ref instanceof PythonDeveloper)
		{
			((PythonDeveloper)ref).learnPython();
		}
		else {
		}
	}

	public static void main(String[] args) {
		
		Developer ref;
		ref=new JavaDeveloper();
		doActivity(ref);
		ref=new PythonDeveloper();
		doActivity(ref);
	}

}
