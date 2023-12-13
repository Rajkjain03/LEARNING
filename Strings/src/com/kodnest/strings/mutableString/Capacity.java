package com.kodnest.strings.mutableString;

public class Capacity {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Omkar is a batsman");
		System.out.println(sb.capacity());
		sb.append("He Lives in bengaluru");
		System.out.println(sb.capacity());
	}
}
