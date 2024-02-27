package com.example.springbootStudent.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootStudent.entities.Student;
import com.example.springbootStudent.repositories.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudentRepository stdRepo;
	
	@Override
	public String createStudent(Student std) {
		stdRepo.save(std);
		return "createstudentsuccess";
	}

	@Override
	public List<Student> fetchStudent() {
		List<Student> listStd =stdRepo.findAll();
		return listStd;
	}

	@Override
	public String updateStudent(Student std) {
		stdRepo.save(std);
		return "updatestudentsuccess";
	}

	@Override
	public String deleteStudent(String rollNo) {
		stdRepo.deleteById(rollNo);
		return "deletestudentsuccess";
	}
	
	
}
