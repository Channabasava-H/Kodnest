package com.example.springbootweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/percentage")
public class PercentageController {
	
	@PostMapping
	public String displayPercentage(@RequestParam String name,
			int sub1, int sub2, int sub3, int sub4, int sub5) 
	{
		
		double per=(sub1+sub2+sub3+sub4+sub5)/5.0;
		
		return name+"'s Percentage is : "+per+"%";
	}
}
