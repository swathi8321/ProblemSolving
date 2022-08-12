package com.slidingwindow.practice;
import java.util.*;

public class MaximumSubArray {
	

    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        int i=0;
        int j=0;
        
        Deque<Integer> q = new LinkedList<>();
        ArrayList<Integer> ansList = new ArrayList<>();
        while(j<arr.length){
        	
        	//calculation
        	if(q.size()<0) {
        		q.add(arr[j]);
        	}else {
        		while(q.size()!=0 && q.peekLast()<arr[j]) {
        			q.removeLast();
        		}
        		q.add(arr[j]);
        	}
        	
            if(j-i+1<k){
                
               j++;
            }else if(j-i+1==k){
               
            	//we have hit the window
                ansList.add(q.peek());
                if(!q.isEmpty()) {
                if(q.peek()==(arr[i])){
                    q.removeFirst();
                }
                }
                i++;
                j++;
                
            }
        }
		return ansList;
    }
    
    
    class Solution{
        
        public static int lenOfLongSubarr (int arr[], int n, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int max = 0;
            int sum = 0;
            
            for(int i=0;i<n;i++){
                sum += arr[i];
                if(sum == k){
                    max = Math.max(i+1 , max);
                }
                else if(map.containsKey(sum-k)){
                    max = Math.max(i-map.get(sum-k) , max);
                }
                if(!(map.containsKey(sum))){
                    map.put(sum, i);
                    
                }
            }
            
            return max;
        }
        
        
    }
    
	public static void main(String[] args) {
		int[] nums = {1,3,-1,-3,5,3,6,7};
	int k=3;
		System.out.println(max_of_subarrays(nums, 8,3));
	}


}
