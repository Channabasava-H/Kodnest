package com.kodnest.methods.calling;

public class MethodCalling_1_Static {

	public static void main(String[] args) {
		int res=staticMethod();
		System.out.println(res);
	}
	
	public static int staticMethod() { //in Case of Static method we can call the method directly
		return 2+4;
	}

}
