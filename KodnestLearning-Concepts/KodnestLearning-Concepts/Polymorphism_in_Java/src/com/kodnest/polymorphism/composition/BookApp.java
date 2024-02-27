package com.kodnest.polymorphism.composition;

public class BookApp {
	
	public static void main(String[] args) {
		
		Book bk=new Book("Kodnest");
		
		bk.readBook();
		
		bk.p.writeContent();
		
		bk=null;
		
		bk.readBook();
		
		bk.p.writeContent();
	}
}
