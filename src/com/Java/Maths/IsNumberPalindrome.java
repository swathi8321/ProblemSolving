package com.Java.Maths;
/*9. Palindrome Number
 * Input: x = 121
	Output: true
	Explanation: 121 reads as 121 from left to right and from right to left.
 */
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
