package com.Java.DynamicProgramming;

import java.util.HashMap;

public class HouseRobber {

	Integer[] saveAnswer;

	public int rob(int[] nums) {
		saveAnswer = new Integer[nums.length];
		return robber(nums, 0);
	}

	public int robber(int[] nums, int i) {
		if (nums.length == 0 || i >= nums.length) {
			return 0;
		}
		if (saveAnswer[i] != null) {
			return saveAnswer[i];
		}
		saveAnswer[i] = Math.max(nums[i] + robber(nums, i + 2), robber(nums, i + 1));
		return saveAnswer[i];
	}

	public static void main(String args[]) {
		HouseRobber hr = new HouseRobber();
		int[] nums = { 2, 7, 9, 3, 1 };
		System.out.println(hr.rob(nums));
	}

}
