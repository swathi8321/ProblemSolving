package com.slidingwindow.practice;

import java.util.ArrayList;
import java.util.List;

public class FirstNegative {
	
	public static ArrayList<Integer> firstNegativeInteger(ArrayList<Integer> arr, int k, int n) {
		// Write your code here.
		int i = 0;
		int j = 0;
		
		ArrayList<Integer> ansList = new ArrayList<Integer>();
		ArrayList<Integer> slidingWindowList = new ArrayList<Integer>();
		
		
		while (j < arr.size()) {
			if (arr.get(j) < 0) {
				slidingWindowList.add(arr.get(j));
			}

			if ((j - i + 1) == k) {
				
				if (slidingWindowList.size() == 0) {
					ansList.add(0);
				} else {
					ansList.add(slidingWindowList.stream().findFirst().get());
					//System.out.println("arr"+arr.get(i)+"sliding first"+slidingWindowList.get(i));
					if (arr.get(i) == slidingWindowList.stream().findFirst().get()) {
						slidingWindowList.remove(0);
						//slidingWindowList.remove(1);
						System.out.println(slidingWindowList);
					}
				//	slidingWindowList.stream().forEach(System.out::println);
					System.out.println("*****");
				}
				i++;

			}
			
			j++;

		}
		return ansList;
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(-10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(-40);
		arrList.add(-50);
		arrList.add(60);
		
		ArrayList<Integer> ansList = firstNegativeInteger(arrList, 2, 6);
		ansList.stream().forEach(System.out::println);
		
	}

}
