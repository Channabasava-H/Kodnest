package com.example.studcrud.services;

import java.util.List;

import com.example.studcrud.entities.Bike;

public interface BikeService {
	
	public String createBike(Bike bk);
	
	public List<Bike> fetchAllBikes();
	
	public String updateBike(Bike bk);
	
	public String deleteBike(String engNo);
}
