package com.kodnest.hibernate.HibernateProject07;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int S_RollNo;
	private String S_Name;
	@OneToMany
	private List<Laptop> L_id;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int s_RollNo, String s_Name, List<Laptop> l_id) {
		super();
		S_RollNo = s_RollNo;
		S_Name = s_Name;
		L_id = l_id;
	}

	public int getS_RollNo() {
		return S_RollNo;
	}

	public void setS_RollNo(int s_RollNo) {
		S_RollNo = s_RollNo;
	}

	public String getS_Name() {
		return S_Name;
	}

	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}

	public List<Laptop> getL_id() {
		return L_id;
	}

	public void setL_id(List<Laptop> l_id) {
		L_id = l_id;
	}

	@Override
	public String toString() {
		return "Student [S_RollNo=" + S_RollNo + ", S_Name=" + S_Name + ", L_id=" + L_id + "]";
	}
	
	
	
}
