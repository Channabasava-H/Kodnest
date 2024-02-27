package com.example.studcrud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studcrud.entities.Laptop;

@RestController
@RequestMapping("laptop")
public class LaptopController {
	
	Laptop lap;
	
	@PostMapping
	String create(@RequestBody Laptop lap) {
		this.lap=lap;
		return "Object Created";
	}
	
	@GetMapping("{srNo}")
	Laptop read(@PathVariable String srNo) {
		return lap;
	}
	
	@PutMapping
	String update(@RequestBody Laptop lap) {
		this.lap=lap;
		return "Object Updated";
	}
	
	@DeleteMapping("{srNo}")
	String delete(@PathVariable String srNo) {
		lap=null;
		return "Object Deleted";
	}
	
}
