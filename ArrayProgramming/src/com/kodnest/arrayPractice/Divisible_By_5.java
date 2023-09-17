package com.kodnest.arrayPractice;

import java.util.Scanner;

public class Divisible_By_5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elementst divisible by 5 are :");
		for(int i=0 ; i<=arr.length-1; i++) {
			if(arr[i]%5==0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
