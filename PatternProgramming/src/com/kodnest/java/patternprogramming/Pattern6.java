package com.kodnest.java.patternprogramming;

public class Pattern6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			if (i > 1) {
				for (int k = 1; k < i; k++) {
					System.out.print(" ");
				}
			}

			for (int j = i; j <= 5; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
