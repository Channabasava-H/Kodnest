package com.example.springbootStudent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootStudent.entities.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
