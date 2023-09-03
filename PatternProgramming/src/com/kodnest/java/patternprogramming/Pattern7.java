package com.kodnest.java.patternprogramming;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		pattern(n);
	}
	
	public static void pattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
