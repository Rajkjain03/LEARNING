package com.ex1;

public class StudentApp {
	public static void doAct(StudentActivities sa) {
		sa.attendClass();
		sa.study();
		sa.assignment();
	}
	
	public static void main(String[] args) {
		PhysicsStudent ps = new PhysicsStudent();
		ChemistryStudent cs = new ChemistryStudent();
		doAct(ps);
		doAct(cs);
	}
}
