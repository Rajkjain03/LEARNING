package com.kodnest.strings.immutableStrings;

public class ReferenceCheck {
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		if(s1==s2) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		
		String s3 = new String("sita");
		String s4 = new String("sita");
		if(s3==s4) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		
		String s5 = "Raj";
		String s6 = new String("Raj");
		if(s5==s6) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		
		String s7 = "rama" + "sita";
		String s8 = "rama" + "sita";
		if(s7==s8) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		
		String s10 = s1+s2;
		String s11 = s1+s2;
		if(s10==s11) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		
		String s9 = s1;
		if(s9 == s1) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
	}
}
