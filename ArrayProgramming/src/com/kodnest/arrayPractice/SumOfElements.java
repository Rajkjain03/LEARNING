package com.kodnest.arrayPractice;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum +arr[i];
		}
		System.out.println(sum);
		
	}

}
