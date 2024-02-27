package com.kodnest.hibernate.HibernateProject06;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class SoftwareEng {
	@javax.persistence.Id
	private int Id;
	private String Name;
	private int Age;
	@ManyToMany
	private List<Technology> tech_id;
	public SoftwareEng() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SoftwareEng(int id, String name, int age, List<Technology> tech_id) {
		super();
		Id = id;
		Name = name;
		Age = age;
		this.tech_id = tech_id;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public List<Technology> getTech_id() {
		return tech_id;
	}
	public void setTech_id(List<Technology> tech_id) {
		this.tech_id = tech_id;
	}
	@Override
	public String toString() {
		return "SoftwareEng [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", tech_id=" + tech_id + "]";
	}
	
	
}
