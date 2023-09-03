package com.kodnest.java.patternType2;

public class Pattern9{
	public static void main(String[] args) {
		
	int n =11;
	for(int i =1; i<=n; i++) {
		for(int j=1; j<=n; j++) {
			if(i==n ||  i ==1 || j ==1 || i == (n+1)/2) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	

}}
