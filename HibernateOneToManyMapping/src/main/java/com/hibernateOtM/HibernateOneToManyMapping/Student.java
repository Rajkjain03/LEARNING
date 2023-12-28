package com.hibernateOtM.HibernateOneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	int s_rollNo;
	String s_name;
	
	@OneToMany
	List<Laptop> ls;

	public Student() {
		super();
	}

	public Student(int s_rollNo, String s_name, List<Laptop> ls) {
		super();
		this.s_rollNo = s_rollNo;
		this.s_name = s_name;
		this.ls = ls;
	}

	public int getS_rollNo() {
		return s_rollNo;
	}

	public void setS_rollNo(int s_rollNo) {
		this.s_rollNo = s_rollNo;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List<Laptop> getLs() {
		return ls;
	}

	public void setLs(List<Laptop> ls) {
		this.ls = ls;
	}

	@Override
	public String toString() {
		return "Student [s_rollNo=" + s_rollNo + ", s_name=" + s_name + ", ls=" + ls + "]";
	}
	
}
