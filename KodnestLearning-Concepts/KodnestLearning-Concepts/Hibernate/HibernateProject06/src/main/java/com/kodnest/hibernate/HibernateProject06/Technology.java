package com.kodnest.hibernate.HibernateProject06;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	private int T_id;
	private String T_name;
	@ManyToMany
	private List<SoftwareEng> se_id;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int t_id, String t_name, List<SoftwareEng> se_id) {
		super();
		T_id = t_id;
		T_name = t_name;
		this.se_id = se_id;
	}
	public int getT_id() {
		return T_id;
	}
	public void setT_id(int t_id) {
		T_id = t_id;
	}
	public String getT_name() {
		return T_name;
	}
	public void setT_name(String t_name) {
		T_name = t_name;
	}
	public List<SoftwareEng> getSe_id() {
		return se_id;
	}
	public void setSe_id(List<SoftwareEng> se_id) {
		this.se_id = se_id;
	}
	@Override
	public String toString() {
		return "Technology [T_id=" + T_id + ", T_name=" + T_name + ", se_id=" + se_id + "]";
	}
	
	
	
}
