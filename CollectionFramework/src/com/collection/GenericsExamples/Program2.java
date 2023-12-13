package com.collection.GenericsExamples;

import java.util.LinkedList;

public class Program2 {
	public static void main(String[] args) {
		LinkedList<Boolean> ll = new LinkedList<Boolean>();
		ll.add(true);
		ll.add(false);
		ll.add(false);
		ll.add(true);
		ll.add(false);
		System.out.println(ll);
	}
}
