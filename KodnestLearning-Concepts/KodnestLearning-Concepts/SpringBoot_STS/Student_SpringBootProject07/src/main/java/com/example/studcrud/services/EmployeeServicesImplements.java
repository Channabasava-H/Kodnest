package com.example.studcrud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studcrud.entities.Employee;
import com.example.studcrud.repositories.EmployeeRepositories;

@Service
public class EmployeeServicesImplements implements EmployeeServices {
	EmployeeRepositories empRepo;
	
	

	public EmployeeServicesImplements(EmployeeRepositories empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public String createEmp(Employee emp) {
		empRepo.save(emp);
		return "object created & saved" ;
	}

	@Override
	public Employee getEmployee(String empId) {
		Employee emp=empRepo.findById(empId).get();
		return emp;
	}
	
	@Override
	public List<Employee> fetchAllEmp() {
		List<Employee> empList = empRepo.findAll();
		return empList;
	}

	@Override
	public String updateEmp(Employee emp) {
		empRepo.save(emp);
		return "object Updated & saved" ;
	}

	@Override
	public String deleteEmp(String empNo) {
		empRepo.deleteById(empNo);
		return "Employee ID "+empNo+" is deleted";
	}

	
	
	
}
