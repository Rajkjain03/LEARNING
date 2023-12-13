package com.collection.Traverse;

import java.util.ArrayList;

public class ArrayListTraverse {
	public static void main(String[] args) {
		ArrayList al =  new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
//			or
//		for(Object i: al) {
//			System.out.println(i);
//		}
	}
}
