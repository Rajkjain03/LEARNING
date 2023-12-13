package com.kodnest.array.searching;

import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter array elments: ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter key value to search: ");
		int key = sc.nextInt();
		boolean flag = false;
		for(int i=0; i<= arr.length-1; i++) {
			if(arr[i] == key) {
				System.out.println("Key found! at " + i );
//				return;
//				System.exit(0);
				flag = true;
			}
		}
		if(flag == false) {
		System.out.println("Key not found!");
		}
	}

}
