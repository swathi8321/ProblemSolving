package com.Java.Strings;
/*
 * 151. Reverse Words in a String
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 */
public class ReverseString {

	public ReverseString() {
		// TODO Auto-generated constructor stub
	}
	
	 public String reverseWords(String s) {
		 
		 StringBuilder strBuilder = new StringBuilder();
		 String tokens[] = s.split(" ");
		 int j= tokens.length-1;
		
		 for(int i=0;i<=(tokens.length-1)/2;i++) {
			 
			swap(i,j,tokens);
			 j--;
		 }
		 
		 for(String str:tokens) {
			 System.out.print(str);
			 strBuilder.append(str);
			 strBuilder.append(" ");
		 }
		 
		
		 return strBuilder.toString();
	 }
	 
	 public static void main(String args[]) {
		 ReverseString rv = new ReverseString();
		 System.out.println(rv.reverseWords("the sky is blue"));
	 }
	 
	 private void swap(int i,int j,String[] str) {
		 String temp = str[i];
		 str[i] = str[j];
		 str[j] = temp;
	 }

}
