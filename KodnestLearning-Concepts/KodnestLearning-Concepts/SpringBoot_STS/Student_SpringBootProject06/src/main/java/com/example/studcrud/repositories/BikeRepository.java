package com.example.studcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studcrud.entities.Bike;

public interface BikeRepository extends JpaRepository<Bike, String>{
	
}
