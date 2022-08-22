package com.Java.Recursion;
import java.util.*;
/*22. Generate Parentheses
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 */
public class PrintAllBalancedParenthesis {

	public PrintAllBalancedParenthesis() {
		// TODO Auto-generated constructor stub
	}
	
	 public List<String> generateParenthesis(int n) {
		 
		 List<String> parenthesisList = new ArrayList<>();
		 int open = n;
		 int close = n;
		 String output = new String("");
		 
		 return generateParenthesisTree(open,close,output,parenthesisList);
	        
	 }
	 
	 private List<String> generateParenthesisTree(int open,int close,String output
			 										,List<String> parenthesisList){
		// System.out.println("open = "+open +" | close =  "+close+
			// 			"| output = "+output+"| parenthList = "+parenthesisList);
		 
		 String op1;
		 String op2;
		 if(open==0 && close==0) {
			 parenthesisList.add(output.toString());
			 return parenthesisList;
		 }
		 
		 if(open!=0) {
			
			 op1=output;
			 op1+="(";
			 generateParenthesisTree(open-1,close,op1,parenthesisList);
		 }
		 
		  if(close>open) {
			  op2=output;
				 op2+=")";
			 generateParenthesisTree(open,close-1,op2,parenthesisList);
		 }
		return parenthesisList;
		 
	 }
	 
	 public static void main(String args[]) {
		 PrintAllBalancedParenthesis pv = new PrintAllBalancedParenthesis();
		 System.out.println(pv.generateParenthesis(3));
	 }

}
