package com.Java.DynamicProgramming;

import java.util.*;
import java.util.stream.Stream;

public class SubsetProblem {

	public SubsetProblem() {
		// TODO Auto-generated constructor stub
	}
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        TreeMap < Integer, Integer > map = new TreeMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        Stream.of(map.keySet().toArray())
        .forEach(System.out::println);
        return count;
    }

    public static void main(String args[]) {
    	SubsetProblem subset=new SubsetProblem();
    	int num[]= {1,3,5,6,8,9};
    	
    	int k =14;
    	subset.subarraySum(num, 14);
    }
	
		
}
