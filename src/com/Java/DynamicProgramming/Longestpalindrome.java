package com.Java.DynamicProgramming;

public class Longestpalindrome {
	public String maxString=null;
	 public String longestPalindrome(String s) {
	      maxString="";
		 return longestPalindromeHelper(s,0,s.length()-1);
		 
	    }

	private String longestPalindromeHelper(String s, int low, int high) {
		
		if(low>high) {
			return "";
		}
		
		if(isPalindrome(s,low,high)) {
			if(maxString.length()<high-low-1) {
			maxString = s.substring(low,high+1);
			}
		}else {
			longestPalindromeHelper(s,low+1,high);
			longestPalindromeHelper(s,low,high-1);
		}
		
		return maxString;
		
	}
	
	private boolean isPalindrome(String s,int low,int high) {
		while(low<high) {
			if(s.charAt(low)!= s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
