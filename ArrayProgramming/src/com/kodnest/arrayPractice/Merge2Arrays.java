package com.kodnest.arrayPractice;

import java.util.Scanner;

public class Merge2Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array 1 length :");
		int arr1[] = new int[sc.nextInt()];

		System.out.println("Enter array 2 length :");
		int arr2[] = new int[sc.nextInt()];

		System.out.println("Enter array 1 elements : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter array 2 elements : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		int arr3[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}				
//					or
		
//		int arr3[] = new int[arr1.length + arr2.length];
//		int i=0; 
//		for(int j=0 ; j<arr1.length; j++) {
//			arr3[i] = arr1[j];
//			i++;
//		}
//		for(int j=0; j<arr2.length; j++) {
//			arr3[i] = arr2[j];
//			i++;
//		}

		System.out.println("Array 3 -->");
		for (int j = 0; j < arr3.length; j++) {
			System.out.print(arr3[j] + " ");
		}
	}
}
