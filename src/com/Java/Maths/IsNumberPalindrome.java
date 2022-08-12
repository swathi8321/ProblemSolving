package com.Java.Maths;

public class IsNumberPalindrome {
	
	public boolean isNumberPalindrome(int x) {
		
		int reverse = 0;
		int temp = x;
		
		while(temp>0) {
			
			reverse = reverse*10 + temp%10;
			temp = temp/10;
			
		}
		if(reverse == x) {
			return true;
		}else {
			return false;
		}
		
	}

}
