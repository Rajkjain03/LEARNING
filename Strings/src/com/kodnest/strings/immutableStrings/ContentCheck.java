package com.kodnest.strings.immutableStrings;

public class ContentCheck {
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		if(s1.equals(s2)) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
		}
		
		String s3 = new String("Sita");
		String s4 = new String("Sita");
		if(s3.equals(s4)) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
		}
		
		String s5 = "Raj";
		String s6 = new String("Raj");
		if(s5.equals(s6)) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
		}
		
		String s7 = "rama" + "sita";
		String s8 = "rama" + "sita";
		if(s7.equals(s8)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		String s10 = s1+s2;
		String s11 = s1+s2;
		if(s10.equals(s11)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
	}
}
