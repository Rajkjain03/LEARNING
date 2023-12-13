package com.kodnest.array.searching;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking length as input from user
		System.out.println("Enter array length: ");
		int arr[] = new int[sc.nextInt()];
		
		//taking elements as input from user
		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//sorting array becouse binary-search work in sorted array
		Arrays.sort(arr);
		
		System.out.println("Enter key : ");
		int key = sc.nextInt();
		
		//printing array
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//binary search algorithm
		int start = 0;
		int end = arr.length -1;
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(key == arr[mid]) {
				System.out.println("Key Found! at index : " + mid);
				return;
			}else if(key >= arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		System.out.println("Key Not Found!");
		
	}
}
