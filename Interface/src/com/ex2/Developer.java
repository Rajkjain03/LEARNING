package com.ex2;

public class Developer implements Backendtech,Frontendtech{

	@Override
	public void learnHTML() {
		System.out.println("Dev learning html");
	}

	@Override
	public void learnJava() {
		System.out.println("Dev learning java");
	}
	
}
