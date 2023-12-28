package com.hibernatepOtM.HibernateManyToManyMappingBiDirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int t_id;
	String t_name;
	
	@ManyToMany
	List<SoftwareEng> ls;
	
	public Technology() {
		super();
	}
	public Technology(int t_id, String t_name, List<SoftwareEng> ls) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.ls = ls;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public List<SoftwareEng> getLs() {
		return ls;
	}
	public void setLs(List<SoftwareEng> ls) {
		this.ls = ls;
	}
	@Override
	public String toString() {
		return "Technology [t_id=" + t_id + ", t_name=" + t_name + ", ls=" + ls + "]";
	}
	
}
