package com.kodnest.cc.lcc;

public class LabeledWhileLoop {

	public static void main(String[] args) {
		int i=0;
		sanjib:while(i++<10) {
			int j=0;
			rithvi:while(j++<10) {
				System.out.println("Hello Kodnest");
				break sanjib;
			}
			System.out.println("Hey!");
		}
	}
}
