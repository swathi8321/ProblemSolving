package com.slidingwindow.practice;
import java.util.*;

public class Intersection {

	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> arrList = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
		}

		for (int j = 0; j < nums2.length; j++) {
			if (map.getOrDefault(nums2[j], 0) > 0) {
				arrList.add(nums2[j]);
				map.put(nums2[j], map.get(nums2[j]) - 1);
			}
		}

		return arrList.stream().mapToInt(x -> x).toArray();
	}

	public int[] myintersect(int[] nums1, int[] nums2) {
		
		//this was working fine until nums1={4,9,5} and nums2={4,9,9,4,3,2} 
		//expected ={4.9}
		//my output={4,9,9,4}

		Map<Integer, Integer> ansMap = new HashMap<Integer, Integer>();
		List<Integer> arrList = new ArrayList<>();

	

			for (int i = 0; i < nums1.length; i++) {
				ansMap.put(nums1[i], i);
			}

			for (int j = 0; j < nums2.length; j++) {
				if (ansMap.get(nums2[j]) != null) {
					arrList.add(nums2[j]);
				}
			}
		

	return arrList.stream().mapToInt(x->x).toArray();
}

}
