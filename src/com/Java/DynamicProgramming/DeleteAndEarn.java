package com.Java.DynamicProgramming;
import java.util.*;
public class DeleteAndEarn {

	public DeleteAndEarn() {
	}
	int value=0;
	List<Integer> list = new ArrayList<Integer>();
	public int deleteAndEarnmine(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			list.add(nums[i]);
		}
		return	deleteEarnhelper(nums,0,list);

	}

	private int deleteEarnhelper(int[] nums, int i,List<Integer> list) {
		
		if(i>= nums.length|| list.isEmpty()) {
		return 0;
		}
		
		List<Integer> tempList = new ArrayList<Integer>();
		tempList.addAll(list);
	//	tempList.stream().forEach(x->System.out.print("temp "+x));
		//System.out.println();
		remove(tempList,nums[i]);
		
		System.out.println("nums[i] is"+nums[i]);
		removeAll(tempList,nums[i]+1);
		removeAll(tempList,nums[i]-1);
		tempList.stream().forEach(x->System.out.print(" "+x));
		//System.out.println("******");
		 value = Math.max(nums[i]+deleteEarnhelper(nums,i+1,tempList)
					,0);
		System.out.println("**value****"+value);
		tempList.addAll(list);
		return value;
		
	}
	public void removeAll(List<Integer> list, int element) {
		System.out.println("element is"+element);
	    list.removeIf(n -> Objects.equals(n, element));
	}
	
	public void remove(List<Integer> list, int element) {
	    for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
	        Integer number = i.next();
	        if (Objects.equals(number, element)) {
	            i.remove();
	            break;
	        }
	    }
	}
	
	 private HashMap<Integer, Integer> points = new HashMap<>();
	    private HashMap<Integer, Integer> cache = new HashMap<>();
	    
	    private int maxPoints(int num) {
	        // Check for base cases
	        if (num == 0) {
	            return 0;
	        }
	        
	        if (num == 1) {
	            return points.getOrDefault(1, 0);
	        }
	        
	        if (cache.containsKey(num)) {
	            return cache.get(num);
	        }
	        
	        // Apply recurrence relation
	        int gain = points.getOrDefault(num, 0);
	        cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));
	        return cache.get(num);
	    }
	    
	    public int deleteAndEarn(int[] nums) {
	        int maxNumber = 0;
	        
	        // Precompute how many points we gain from taking an element
	        for (int num : nums) {
	            points.put(num, points.getOrDefault(num, 0) + num);
	            maxNumber = Math.max(maxNumber, num);
	        }
	        
	        return maxPoints(maxNumber);
	    }
	public static void main(String args[]) {
		DeleteAndEarn d = new DeleteAndEarn();
		int num[]= {3,4,2,6};
		System.out.println("="+d.deleteAndEarn(num));
	}
}
