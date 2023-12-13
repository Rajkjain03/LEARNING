package com.collection.PriorityQueue;

import java.util.PriorityQueue;

public class Program1 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(40);
		pq.add(50);
		pq.add(20);
		pq.add(10);
		pq.add(30);
		System.out.println(pq);
		
//		pq.add("java");  //Exception, cant store hetrogenous type of data
	}
}
