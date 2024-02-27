package com.example.studcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studcrud.entities.Student;

@RestController
@RequestMapping("stud")
public class StudentController {

	@GetMapping("{kodId}")
	public Student getStudentObj(@PathVariable String kodId) {
		Student st=new Student(kodId,"Sanjeev",24);
		return st;
	}
}
