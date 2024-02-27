package com.kodnest.recursion.level1;

public class GCD {
	public int findGcd(int m,int n) {
		if(n==0) {
			return m;
		}
		else {
			return findGcd(n,m%n);
		}
		
	}

}
