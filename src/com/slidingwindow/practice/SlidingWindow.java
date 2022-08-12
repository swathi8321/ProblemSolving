package com.slidingwindow.practice;
/*Indentification of sliding window
 * 1.Given array or string
 * 2.do something on subarray
 * 3.maximum or minimum of subarrays
 * 4.size of subaray with size k
 */

public class SlidingWindow {
	private static int solve(int[] arr, int k) {
		int n = arr.length;
		int i = 0, j = 0, max = Integer.MIN_VALUE, sum = 0;
		while (j < n) {
			sum += arr[j];
			if (j - i + 1 == k) {
				max = Math.max(max, sum);
				sum -= arr[i];
				i++;
			}
			j++;
		}
		return max;
	}
	
	public static int minSubArrayLen(int target, int[] nums) {
		int i=0,j=0;//two pointers
	    int ans=-1;// storing min length
	    int sum=0;
	    while(j<nums.length)
	    {
	        sum=sum+nums[j];
	        while(i<=j&&sum>=target)
	            {
	                if(ans==-1||ans>(j-i+1))
	            {
	                ans=j-i+1;                  
	            }
	                sum=sum-nums[i];
	                i++;
	            }
	        j++;
	    }
	    return ans==-1?0:ans;
		}
	
	
	public static int minSubArrayLen1(int target, int[] nums) {

		int i = 0;
		int j = 0;
		int sum = 0;
		int minArray = Integer.MAX_VALUE;

		while (j <= nums.length) {
			if(j!=nums.length)
				sum = sum + nums[j];
			if (sum >= target ) {
				
				sum = sum - nums[i];
				i++;
				//System.out.println(nums[i]+" and"+ nums[j]);
				minArray=Integer.min(minArray,j-i+1);
				System.out.println(minArray);
			}
			
			j++;
			
			System.out.println("*********");
		}
		
		return minArray;
	}
	
	public static void main(String[] args) {
		int[] nums= {2,3,1,2,4,3};
		int target=7;
	System.out.println(  minSubArrayLen(target,nums));
	}
}
