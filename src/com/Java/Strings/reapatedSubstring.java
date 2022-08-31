package com.Java.Strings;

public class reapatedSubstring {
	/*Take 2 pointers and find the pattern if its not length is not even then no point
	 * if the length is eaqual to mid and start pointer then proceed
	 */
	public boolean repeatedSubstringPattern1(String s) {

		int n = s.length();

		if (s == null || s.isEmpty() || n == 1) {
			return false;
		}

		int mid = s.length() / 2;
		int j = 0;

		for (int i = mid; i > 0; i--) {
			if (n % i == 0)// to chk if string is unqual like aabaaba
			{
				while (j + i < n && s.charAt(j) == s.charAt(j + i))
					j++;
				if (i + j == n)
					return true;
			}
		}

		return false;

	}
	/*take a string append it with its own and remove first and last character
	 * for e.g patternpattern => patternpatternpatternpattern =>atternpatternpatternpatter
	 * pattern is substring of answer2
	 * but do same for pattern1pattern2 it wont work
	 */
	public boolean repeatedStringPattern2(String s) {
		
	String newstr= s+s;
	return newstr.substring(1,s.length()-1).contains(s);
	}
}
