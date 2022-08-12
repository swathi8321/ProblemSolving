package com.Java.HashMap;

import java.util.HashSet;
import java.util.Set;


public class HappyNumber {
	
	public int getSum(int n) {
		int totalSum =0;
		
		while(n>0) {
			
			int denominator = n%10;
			n = n/10;
			totalSum += denominator*denominator;
		}
		
		return totalSum;
	}
	
	public boolean isHappynumber(int n) {
		
		Set<Integer> seen = new HashSet<Integer>();
		
		while(n != 1 && !seen.contains(n)) {
			seen.add(n);
			n = getSum(n);
		}
		
		return n==1;
	}

}
