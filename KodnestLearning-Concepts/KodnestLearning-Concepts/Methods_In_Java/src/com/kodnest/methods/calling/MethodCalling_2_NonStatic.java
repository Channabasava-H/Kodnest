package com.kodnest.methods.calling;

public class MethodCalling_2_NonStatic {

	public static void main(String[] args) {
		MethodCalling_2_NonStatic obj=new MethodCalling_2_NonStatic();
			System.out.println(obj.method());
		}
	
		int method() { //in Case of In class Non Static method we have to make an object of the class to call the method
			return 2+4;
		}
}
