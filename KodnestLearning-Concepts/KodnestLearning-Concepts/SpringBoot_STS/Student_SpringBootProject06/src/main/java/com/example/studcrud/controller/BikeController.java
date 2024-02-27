package com.example.studcrud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studcrud.entities.Bike;
import com.example.studcrud.services.BikeService;

@RestController
@RequestMapping("bike")
public class BikeController {
	BikeService bkservc;
	
	public BikeController(BikeService bkservc) {
		super();
		this.bkservc = bkservc;
		System.out.print("inside Bike controlller constructor"+bkservc);
	}

	@PostMapping
	public String createBike(@RequestBody Bike bk){
		String msg=bkservc.createBike(bk);
		return msg;
	}
}
//	

//	@GetMapping("{engNo}")
//	public Bike read(@PathVariable String engNo) {
//		return bk;
//	}
//	
//	@PutMapping
//	public String update(@RequestBody Bike bk) {
//		this.bk=bk;
//		return "Object Updated";
//	}
//	
//	@DeleteMapping("{engNo}")
//	public String delete(@PathVariable String engNo) {
//		bk=null;
//		return "Object Deleted";
//	}
//}
