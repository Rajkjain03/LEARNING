package com.collection.GenericsExamples;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Program3 {
	public static void main(String[] args) {
		ArrayDeque<Character> ad = new ArrayDeque<Character>();
		ad.add('A');
		ad.add('B');
		ad.add('C');
		ad.add('D');
		ad.add('E');
		System.out.println(ad);
		
	}
}
