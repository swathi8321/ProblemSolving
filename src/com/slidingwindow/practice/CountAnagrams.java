package com.slidingwindow.practice;
import java.util.*;

public class CountAnagrams {

	static int search(String pat, String txt) {
		// code here
		Map<Character, Integer> patternMap = new HashMap<Character, Integer>();
		Map<Character, Integer> answerMap = new HashMap<Character, Integer>();
		for (int i = 0; i < pat.length(); i++) {
			patternMap.put(pat.charAt(i), patternMap.getOrDefault(pat.charAt(i), 0) + 1);
		}
		int count = patternMap.size();
		int i = 0;
		int j = 0;
		int ans = 0;

		while (j < txt.length()) {
			answerMap.put(txt.charAt(j), patternMap.getOrDefault(txt.charAt(j), 0) + 1);
			if (j - i + 1 < pat.length()) {
				j++;
			} else if (j - i + 1 == pat.length()) {
				if (answerMap.size()==patternMap.size()) {
					count++;
					ans++;
				}
				answerMap.put(txt.charAt(i), patternMap.getOrDefault(txt.charAt(i), 0) - 1);
				i++;
				j++;
			}
			

		}

		return ans;
	}
	
	static int searchFromAns(String strPat, String strTxt) {

		char[] pat = strPat.toCharArray();
		char[] txt = strTxt.toCharArray();
		int[] ans = new int[26];
		int[] arr = new int[26];
		for (int i = 0; i < pat.length; i++) {
			ans[pat[i] - 'a']++;
		}
		int i = 0;
		int j = 0;
		int count = 0;
		while (j < txt.length) {
			arr[txt[j] - 'a']++;
			if (j - i + 1 < pat.length) {
				j++;
			} else if (j - i + 1 == pat.length) {
				if (Arrays.equals(arr, ans)) {
					count++;
				}
				arr[txt[i] - 'a']--;
				i++;
				j++;
			}
		}
		return count;

	}
		
	

	public static void main(String[] args) {
		String txt = "aabaabaa";
		String		pat = "aaba";
		System.out.println(searchFromAns(pat, txt));
	}

}
