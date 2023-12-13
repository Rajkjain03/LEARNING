package com.collection.Traverse;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListTraverse {
	public static void main(String[] args) {
		LinkedList ll =  new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
//		for(int i=0; i<ll.size(); i++) {
//			System.out.println(ll.get(i));
//		}
//		or	
//		for(Object i: ad) {
//			System.out.println(i);
//		}
		
//		or
		Iterator itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
