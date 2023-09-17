package com.kodnest.arrayPract2;

public class PrintArray {
	public void printArray(int []arr) {
		System.out.println("Array elements in forward direction are: ");
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("Array elemets in backward direction are:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[arr.length-1-i] + " ");
		}
	}
}
