package com.kodnest.spring.SpringProject07AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class University {
	//@Autowired
	//@Qualifier("pr3")
	Professor pr;

	public University() {
		super();
		
	}
	
	//@Autowired
	public University(Professor pr) {
		super();
		this.pr = pr;
		System.out.println("Using Constructor.");
	}

	public Professor getPr() {
		return pr;
		
	}
	//@Autowired
	public void setPr(Professor pr) {
		this.pr = pr;
		System.out.println("Using Setters.");
	}

	@Override
	public String toString() {
		return "University [pr=" + pr + "]";
	}

	
	
	
}
