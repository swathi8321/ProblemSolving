package com.slidingwindow.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class MaxInSlidingWindow {
	
	public static int maxSlidingWindow(int[] nums, int k) {
		int i = 0;
		int j = 0;
		int max = Integer.MIN_VALUE;
		int sum = 0;

		List<Integer> ansList = new ArrayList<>();

		while (j < nums.length) {
			j++;
			sum = sum + nums[j - 1];
			max = Math.max(sum, max);
			if (sum <= 0) {
				i = j;
				sum = 0;
			}

		}
		return max;
	}
	 public static void main(String[] args) {
			int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
			int target=3; 	
	//		maxSlidingWindow(nums,target);
	 //Arrays.stream( maxSlidingWindow(nums,target)).forEach(System.out::println);
			System.out.println(maxSlidingWindow(nums,target));
		}

}
