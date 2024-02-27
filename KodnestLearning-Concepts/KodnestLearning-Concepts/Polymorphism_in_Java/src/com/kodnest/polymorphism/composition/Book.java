package com.kodnest.polymorphism.composition;

public class Book {
	
	String author;
	
	Page p=new Page("Java");
	
	Book(String author)
	{
		this.author=author;
	}
	
	void readBook()
	{
		System.out.println("Reading book by author "+author);
	}
}
