package com.kodnest.strings.immutableStrings;

public class CreatingImmutableString {
	public static void main(String[] args) {
//		1
		String s1 = "Ramu";
		System.out.println(s1);
		
//		2
		String s2 = new String("Raj");
		System.out.println(s2);
		
//		3
		char arr[] = new char[3];
		arr[0] = 'a';
		arr[1] = 'v';
		arr[2] = 'j';
		
		String s3 = new String(arr);
		System.out.println(s3);
		
//		or
		char b[] = {'a','v','j'};
		String s31 = new String(b);
		System.out.println(s31);
		
	}
}
