package com.slidingwindow.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int k = 0;
		List<Integer> ansList = new ArrayList<>();

		while (j < nums.length) {

			j++;
			sum += nums[i];

			if (sum == target) {
				ansList.add( i);
				return ansList.stream().mapToInt(x->x).toArray();
			} else {
				if (sum > target) {
					sum = sum - nums[i];
					
				}
				ansList.add( i);
				i++;
				
				k++;
			}

		}
		return ansList.stream().mapToInt(x->x).toArray();

	}


	
	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		Arrays.stream(twoSum(nums, target)).forEach(System.out::print);
		System.out.println(twoSum(nums, target));
	}

}
