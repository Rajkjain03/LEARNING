package com.kodnest.arrayPractice;

import java.util.Scanner;

public class PrintEvenElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array: ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Even elements are: ");
		for(int i =0 ;i<= arr.length-1; i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
