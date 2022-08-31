package com.Java.Strings;

public class CharacterCountisSame {
	public boolean repeatedSubstringPattern(String s) {
        int[] cnt = new int[26];
        
        char[] strArray = s.toCharArray();
        
        for(Character c:strArray){
            cnt[c-'a']++;
        }
        
        for(int i:cnt){
            if(i%2 != 0){
                return false;
            }
        }
        
        return true;
    }

}
