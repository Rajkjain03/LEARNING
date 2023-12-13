package com.ex1;

public class PhysicsStudent implements StudentActivities {

	@Override
	public void attendClass() {
		System.out.println("physics student attending class");
	}

	@Override
	public void study() {
		System.out.println("Physics student studying");
	}

	@Override
	public void assignment() {
		System.out.println("Physics assignment");
	}
	
}
