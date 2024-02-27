package com.kodnest.recursion.level1;

public class Factorial {
	
	public int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

}
