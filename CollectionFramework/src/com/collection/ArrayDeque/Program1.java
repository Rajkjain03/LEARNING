package com.collection.ArrayDeque;

import java.util.ArrayDeque;

public class Program1 {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("java");
		ad.add(98.5f);
		ad.add(true);
		System.out.println(ad);
	}

}
