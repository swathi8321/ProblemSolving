package com.Java.Strings;

/* 443. String Compression
 * Input: chars = ["a","a","b","b","c","c","c"]
	Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
	Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
 */
public class StringCompression {

	public int compress(char[] chars) {
		
		StringBuilder strBuilder = new StringBuilder();
		int count = 1;

		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == chars[i + 1]) {
				count++;
			} else {
				strBuilder.append(chars[i]);
				if (count > 1) {
					strBuilder.append(count);
				}
				count = 1;
			}
		}

		strBuilder.append(chars[chars.length - 1]);
		if (count > 1) {
			strBuilder.append(count);
		}

		for (int i = 0; i < strBuilder.length(); i++) {
			chars[i] = strBuilder.charAt(i);
		}
		
		System.out.println(strBuilder.toString());
		return strBuilder.length();

	}

	public static void main(String args[]) {
		StringCompression s = new StringCompression();
		char[] arr = { 'a', 'a', 'b', 'b', 'b' };
		
		System.out.println(s.compress(arr));
	}

}
