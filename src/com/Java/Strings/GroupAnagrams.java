package com.Java.Strings;

import java.util.*;

public class GroupAnagrams {

	public GroupAnagrams() {
		// TODO Auto-generated constructor stub
	}

    public List<List<String>> groupAnagrams(String[] strs) {
    	 Map<String,List<String>> gpMap = new HashMap<String,List<String>>(); 
         
         for(String str:strs){
             char tempArray[] = str.toCharArray(); 
             Arrays.sort(tempArray);
             String sortedString= new String(tempArray);
         
            if (!gpMap.containsKey(sortedString)){
                gpMap.put(sortedString, new ArrayList());
            } 
             gpMap.get(sortedString).add(str);
             
         }
           return new ArrayList(gpMap.values());
       
    }
}
