package com.hibernateOtM.HibernateOneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	int l_SrNo;
	String l_brand;	
	
	@ManyToOne
	Student s;

	public Laptop() {
		super();
	}

	public Laptop(int l_SrNo, String l_brand, Student s) {
		super();
		this.l_SrNo = l_SrNo;
		this.l_brand = l_brand;
		this.s = s;
	}

	public int getL_SrNo() {
		return l_SrNo;
	}

	public void setL_SrNo(int l_SrNo) {
		this.l_SrNo = l_SrNo;
	}

	public String getL_brand() {
		return l_brand;
	}

	public void setL_brand(String l_brand) {
		this.l_brand = l_brand;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Laptop [l_SrNo=" + l_SrNo + ", l_brand=" + l_brand + ", s=" + s + "]";
	}
	
}
