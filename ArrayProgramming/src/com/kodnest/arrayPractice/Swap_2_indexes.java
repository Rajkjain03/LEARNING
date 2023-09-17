package com.kodnest.arrayPractice;

import java.util.Scanner;

public class Swap_2_indexes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter arrya length : ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter arrya elements : ");
		for(int i =0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter 2 indexes to swap: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before swapping");
		System.out.print("Arr--> ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		int temp =0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		System.out.println("After swapping");
		System.out.print("Arr--> ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
