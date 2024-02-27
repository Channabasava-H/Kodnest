package com.example.springbootStudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springbootStudent.entities.Student;
import com.example.springbootStudent.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService stdServc;

	@GetMapping("/map_add")
	public String mapAddStudent() {
		return "createstudent";
	}
	
	@GetMapping("/map_update")
	public String mapUpdateStudent() {
		return "updateform";
	}
	
	@GetMapping("/map_delete")
	public String mapDeleteStudent() {
		
		return "deleteform";
	}

	@PostMapping("/addStudent")
	public String createStudent(@ModelAttribute Student std) {
		String response=stdServc.createStudent(std);
		return response;
		
	}
	
	@GetMapping("/fetchStudent")
	public String fetchStudent(Model model){
		//Fetching the student data through service
		List<Student> listStdValues=stdServc.fetchStudent();
		//Adding the fetched data in the model
		model.addAttribute("students", listStdValues);
		//Sending control to viewstudent.html
		return "viewstudent";
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student std) {
		String rsp=stdServc.updateStudent(std);
		return rsp;
	}
	
	
	@PostMapping("/deleteStudent")
	public String deleteStudent(@RequestParam String rollNo) {
		String rsp = stdServc.deleteStudent(rollNo);
		return rsp;
	}
}

