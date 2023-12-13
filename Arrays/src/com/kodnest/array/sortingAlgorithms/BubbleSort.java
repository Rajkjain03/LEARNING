package com.kodnest.array.sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
	public static void swap(int arr[], int a, int b) {
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: ");
		int arr[] = new int[sc.nextInt()];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before Sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i <= arr.length-2; i++) {
			for (int j = 0; j <= arr.length-2-i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap( arr, j , j+1);
				}
			}
		}
		
		System.out.println("After Sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
