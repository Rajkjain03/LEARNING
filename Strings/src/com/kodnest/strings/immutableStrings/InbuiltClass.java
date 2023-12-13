package com.kodnest.strings.immutableStrings;

public class InbuiltClass {
	public static void main(String[] args) {
		String s = new String("My Name Is Raj");
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf('R'));
		System.out.println(s.charAt(11));
		System.out.println(s.contains("Raj"));
		System.out.println(s.contains("ame"));
		System.out.println(s.contains("ame I"));
		System.out.println(s.substring(8));
		System.out.println(s.substring(3,7));
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s.replace('a', 'b'));
		
	}
}
