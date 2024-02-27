package com.example.studcrud.services;

import java.util.List;

import com.example.studcrud.entities.Employee;

public interface EmployeeServices {
	
	public String createEmp(Employee emp);
	
	public Employee getEmployee(String empId);
	
	public List<Employee> fetchAllEmp();
	
	public String updateEmp(Employee emp);
	
	public String deleteEmp(String empNo);
}
