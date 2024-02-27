package com.kodnest.polymorphism.composition;

public class Page {
	
	String content;
	
	Page(String content)
	{
		this.content=content;
	}
	
	void writeContent() 
	{
		System.out.println("Writing Content "+content+"in page");
	}
}
