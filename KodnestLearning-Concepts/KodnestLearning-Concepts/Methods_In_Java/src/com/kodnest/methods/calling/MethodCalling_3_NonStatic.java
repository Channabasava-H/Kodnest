package com.kodnest.methods.calling;

public class MethodCalling_3_NonStatic {

	public static void main(String[] args) {
		DemoObj obj=new DemoObj();
		obj.method(); //to call a Non static method from a different class, we need to make an object of that class.
	}
}
