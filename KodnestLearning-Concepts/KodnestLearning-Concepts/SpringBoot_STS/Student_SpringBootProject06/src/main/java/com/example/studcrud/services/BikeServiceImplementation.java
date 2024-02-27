package com.example.studcrud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studcrud.entities.Bike;
import com.example.studcrud.repositories.BikeRepository;

@Service
public class BikeServiceImplementation implements BikeService{
	BikeRepository bkrepo;
	
	

	public BikeServiceImplementation(BikeRepository bkrepo) {
		super();
		this.bkrepo = bkrepo;
	}

	@Override
	public String createBike(Bike bk) {
		bkrepo.save(bk);
		return "Bike object is created and saved";
	}

	@Override
	public List<Bike> fetchAllBikes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBike(Bike bk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBike(String engNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
