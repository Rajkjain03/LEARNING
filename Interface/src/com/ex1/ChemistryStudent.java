package com.ex1;

public class ChemistryStudent implements StudentActivities {

	@Override
	public void attendClass() {
		System.out.println("Chemistry student attending class");
	}

	@Override
	public void study() {
		System.out.println("chemistry student studying");
	}

	@Override
	public void assignment() {
		System.out.println("chemistry assignment");
	}
	
}
