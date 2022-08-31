package com.Java.DynamicProgramming;
/*583. Delete Operation for Two Strings
 * Input: word1 = "sea", word2 = "eat"
Output: 2
Explanation: You need one step to make "sea" to "ea" 
and another step to make "eat" to "ea".
 */
public class leastCommonSubsequence {
	
	
	
	 public int minDistance(String word1, String word2) {
		 
		 //this will take lots of time so in order to reduce we need dp
		 return minDistanceRecursion(word1,word2,word1.length(),word2.length());
	 }

	private int minDistanceRecursion(String word1, String word2, int m, int n) {
		
		//base condition
		if(m==0||n==0) {
			return 0; //since we can't make string equal
		}
		
		if(word1.charAt(m-1)==word2.charAt(n-1)) {
			//found match
			return 1+minDistanceRecursion(word1,word2,m-1,n-1);
		}else {
			return Math.min(minDistanceRecursion(word1,word2,m-1,n), 
					minDistanceRecursion(word1,word2,m,n-1));
		}
	}
	int dp[][];
	public int minDistanceOptimisation(String word1, String word2) {
		 dp = new int[word1.length()+1][word2.length()+1];
		 //this will take lots of time so in order to reduce we need dp
		 return minDistanceRecursionOpti(word1,word2,word1.length(),word2.length());
	 }

	private int minDistanceRecursionOpti(String word1, String word2, int m, int n) {
		if(m==0||n==0) {
			return 0;
		}
		if(dp[m][n]>0) {
			return dp[m][n];
		}
		
		if(word1.charAt(m-1)==word2.charAt(n-1)) {
			//found match
			dp[m][n]= 1+minDistanceRecursion(word1,word2,m-1,n-1);
		}else {
			dp[m][n]= Math.min(minDistanceRecursion(word1,word2,m-1,n), 
					minDistanceRecursion(word1,word2,m,n-1));
		}
			return dp[m][n];
	}
}
