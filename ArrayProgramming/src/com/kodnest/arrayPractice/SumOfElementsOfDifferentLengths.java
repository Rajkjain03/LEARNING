package com.kodnest.arrayPractice;

import java.util.Scanner;

public class SumOfElementsOfDifferentLengths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array 1 length : ");
		int arr1[] = new int[sc.nextInt()];

		System.out.println("Enter array 2 length : ");
		int arr2[] = new int[sc.nextInt()];

		System.out.println("Enter array 1 elements :");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter array 2 elements :");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int arr3[] = new int[arr2.length>arr1.length?arr2.length:arr1.length];
		if(arr1.length<arr2.length) {
			int i=0; 
			for(int j =0 ; j<arr1.length; j++) {
				arr3[i] = arr1[j] + arr2[i];
				i++;
			}
			for(int k =i ; k<arr2.length;k++) {
				arr3[k] = arr2[k];
				i++;
			}
		}else {
			int i=0;
			for(int j =0 ; j<arr2.length; j++) {
				arr3[i] = arr2[j] + arr1[i];
				i++;
			}
			for(int k =i ; k<arr1.length;k++) {
				arr3[k] = arr1[k];
				i++;
			}
		}
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
	}
}
