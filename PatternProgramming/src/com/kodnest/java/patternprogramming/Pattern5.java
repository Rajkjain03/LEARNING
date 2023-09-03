package com.kodnest.java.patternprogramming;

public class Pattern5 {
	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			for (int i = j; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
