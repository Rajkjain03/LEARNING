package com.kodnest.arrayPractice;

import java.util.Scanner;

public class ReverseCopy {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the length of an array -:");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter elements of array -:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int copy[] = new int[arr.length];
		
//		int j = copy.length-1;
//		for(int i =0; i<arr.length; i++) {
//			copy[j] = arr[i];
//			j--;
//		}
		             // or
		for(int i=0; i<arr.length; i++) {
			copy[i] = arr[arr.length-1-i];
		}
		
		System.out.println("arr1-->");
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("copy-->");
		for(int i=0 ; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
	}

}
