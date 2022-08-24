package com.Java.DynamicProgramming;

public class MinimumCostStairs {

	public MinimumCostStairs() {
		// TODO Auto-generated constructor stub
	}

	
	  public int minCostClimbingStairs(int[] cost) {
		 return mininmumCostCalibration(cost,cost.length);
	        
	   }


	private int mininmumCostCalibration(int[] cost, int i) {
		if ( i <=1) {
			return 0;
		}
	
		return Math.min(cost[i-2]+mininmumCostCalibration(cost, i - 2),  cost[i-1]+mininmumCostCalibration(cost, i - 1));
	}
	
	public static void main(String args[]) {
		MinimumCostStairs hr = new MinimumCostStairs();
		int[] nums = { 1,100,1,1,1,100,1,1,100,1 };
		System.out.println(hr.minCostClimbingStairs(nums));
	}
}
