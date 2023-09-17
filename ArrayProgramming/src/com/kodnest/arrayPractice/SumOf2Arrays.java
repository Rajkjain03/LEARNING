package com.kodnest.arrayPractice;

import java.util.Scanner;

public class SumOf2Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array 1 length :");
		int arr1[] = new int[sc.nextInt()];

		int arr2[] = new int[arr1.length];
		
		System.out.println("Enter array 1 elements : ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter array 2 elements : ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int arr3[] = new int[arr1.length];
		
		for(int i=0 ; i<arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		
		System.out.println("Array 3 -->");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}
