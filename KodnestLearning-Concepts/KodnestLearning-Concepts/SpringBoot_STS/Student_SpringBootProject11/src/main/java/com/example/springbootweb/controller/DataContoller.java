package com.example.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataContoller {
		
	@GetMapping("/display")
	public String displayData() {
		return "response";
	}
}
