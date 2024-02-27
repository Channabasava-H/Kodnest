package com.example.studcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studcrud.entities.Employee;

public interface EmployeeRepositories extends JpaRepository<Employee,String>{
	
	
}
