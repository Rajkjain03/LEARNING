package com.kodnest.java.patternprogramming;

public class Pattern9 {
//	public static void main(String[] args) {
//		for(int i =1; i<=5; i++) {
//			for(int j =1; j<= 5-i+1; j++) {
//				System.out.print(5-j+1);
//			}
//			System.out.println();
//		}
//	}
	
	public static void main(String[] args) {
		for(int i =1 ; i<=5; i++) {
			for(int j =5; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
//output-
//54321
//5432
//543
//54
//5
