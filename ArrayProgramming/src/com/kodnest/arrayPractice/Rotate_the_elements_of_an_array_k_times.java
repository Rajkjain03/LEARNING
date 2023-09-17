package com.kodnest.arrayPractice;
import java.util.Scanner;

public class Rotate_the_elements_of_an_array_k_times {
	
	public static void swap(int arr[],int a, int b) {
		int temp =0;
		temp =arr[a];
		arr[a] = arr[b];
		arr[b]= temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter k value : ");
		int k = sc.nextInt();
		while(k>0) {
//			for(int i = 0; i<arr.length-1; i++) {
//				swap(arr,arr.length-1-i, arr.length-1-(i+1));
//			}
//							or
			for(int i= arr.length-1; i-1>=0; i--) {
				swap(arr,i,i-1);
			}

			k--;
		}
		
		System.out.println("Array after rotating k times: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
