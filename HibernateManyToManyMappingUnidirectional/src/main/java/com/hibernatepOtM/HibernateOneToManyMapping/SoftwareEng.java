package com.hibernatepOtM.HibernateOneToManyMapping;

import java.util.*;

import javax.persistence.*;


@Entity
public class SoftwareEng {
	@Id
	int id;
	String name;
	int age;
	
	@ManyToMany
	List<Technology> ls;
	
	public SoftwareEng() {
		super();
	}

	public SoftwareEng(int id, String name, int age, List<Technology> ls) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.ls = ls;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Technology> getLs() {
		return ls;
	}

	public void setLs(List<Technology> ls) {
		this.ls = ls;
	}

	@Override
	public String toString() {
		return "SoftwareEng [id=" + id + ", name=" + name + ", age=" + age + ", ls=" + ls + "]";
	}


}
