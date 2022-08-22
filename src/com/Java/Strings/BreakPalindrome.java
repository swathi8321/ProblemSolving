package com.Java.Strings;
/*  1328. Break a Palindrome
 * 
 * 
 * Input: palindrome = "abccba"
	Output: "aaccba"
	Explanation: There are many ways to make "abccba" not a palindrome, such as "zbccba", "aaccba", and "abacba".
	Of all the ways, "aaccba" is the lexicographically smallest.
 * 
 */
public class BreakPalindrome {

	public BreakPalindrome() {
		// TODO Auto-generated constructor stub
	}

	public String breakPalindrome(String palindrome) {
        //find lexicographically smallest
        //find second lexigraphically smallest
        //replace with smallest them and return that string
        
        
        //take mid of the string and put in string 
        //sort that part abc
        /*
                smallest=a
                secondsmallest = b
                aaccba
        */
        if(palindrome.length()==1){
            return "";
        }
        char[] characterArray = palindrome.toCharArray();
        
        for(int i=0;i<characterArray.length/2;i++){
            if(characterArray[i]!='a'){
                characterArray[i]='a';
                return String.valueOf(characterArray);
            }
        }
        
        characterArray[characterArray.length-1] = 'b';
        return String.valueOf(characterArray);
        
        
    }
}
