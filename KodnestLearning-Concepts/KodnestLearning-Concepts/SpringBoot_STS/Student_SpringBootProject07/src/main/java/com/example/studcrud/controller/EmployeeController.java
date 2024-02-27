package com.example.studcrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studcrud.entities.Employee;
import com.example.studcrud.services.EmployeeServices;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	EmployeeServices empservc;

	public EmployeeController(EmployeeServices empservc) {
		super();
		this.empservc = empservc;
	}

	@PostMapping
	public String createEmp(@RequestBody Employee emp) {
		String msg=empservc.createEmp(emp);
		return msg;
	}
	
	@GetMapping("{empId}")
	public Employee getEmployee(@PathVariable String empId) {
		Employee e=empservc.getEmployee(empId);
		return e; 
	}
	
	@GetMapping("allEmp")
	public List<Employee> fetchAllEmp(){
		 List<Employee> empListObj =empservc.fetchAllEmp();
		return empListObj;
	}
	
	@PutMapping
	public String updateEmp(@RequestBody Employee emp) {
		String msg=empservc.updateEmp(emp);
		return msg;
	}
	
	@DeleteMapping("{empNo}")
	public String deleteEmp(@PathVariable String empNo) {
		String msg=empservc.deleteEmp(empNo);
		return msg;
	}
	
}
