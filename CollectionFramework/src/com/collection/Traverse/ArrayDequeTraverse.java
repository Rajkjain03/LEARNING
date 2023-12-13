package com.collection.Traverse;

import java.util.ArrayDeque;

public class ArrayDequeTraverse {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
//		traditional for loop
//		for(int i=0; i<ad.size(); i++) {
//			System.out.println(ad.get(i));  //Error
//		}
		
//		advanced for loop or enhanced for loop
		for(Object i: ad) {
			System.out.println(i);
		}
	}
}
