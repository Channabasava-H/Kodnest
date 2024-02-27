package com.example.springbootStudent.services;

import java.util.List;

import com.example.springbootStudent.entities.Student;

public interface StudentService {
	
	public String createStudent(Student std);
	
	public String updateStudent(Student std);
	
	public List<Student> fetchStudent();
	
	public String deleteStudent(String rollNo);
}
