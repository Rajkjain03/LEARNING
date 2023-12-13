package com.kodnest.array.sortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length:");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<=arr.length-2; i++) {
			int min = arr[i];
			int pos = i;
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		
		System.out.println("After sorting: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
