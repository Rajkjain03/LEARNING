package com.hibernatepOtO.HibernateOneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	int b_engNo;
	String b_brand;
	int b_cost;
	@OneToOne
	Person p;
	
	public Bike() {
		super();
	}

	public Bike(int b_engNo, String b_brand, int b_cost, Person p) {
		super();
		this.b_engNo = b_engNo;
		this.b_brand = b_brand;
		this.b_cost = b_cost;
		this.p = p;
	}

	public int getB_engNo() {
		return b_engNo;
	}

	public void setB_engNo(int b_engNo) {
		this.b_engNo = b_engNo;
	}

	public String getB_brand() {
		return b_brand;
	}

	public void setB_brand(String b_brand) {
		this.b_brand = b_brand;
	}

	public int getB_cost() {
		return b_cost;
	}

	public void setB_cost(int b_cost) {
		this.b_cost = b_cost;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Bike [b_engNo=" + b_engNo + ", b_brand=" + b_brand + ", b_cost=" + b_cost + ", p=" + p + "]";
	}
	
}
