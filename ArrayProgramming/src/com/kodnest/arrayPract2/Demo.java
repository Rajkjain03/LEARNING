package com.kodnest.arrayPract2;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter array elements: ");
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		PrintArray p = new PrintArray();
		p.printArray(arr);
		
	}
}
