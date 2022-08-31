package com.Java.Maths;
import java.util.*;
public class CountBits {
	public int[] sortByBits(int[] arr) {
		Map<Integer, List<Integer>> sortBybitsMap = new TreeMap<>();
		for (int i : arr) {
			int bitLength = String.valueOf(Integer.bitCount(i)).length();
			if (sortBybitsMap.containsKey(bitLength)) {
				List<Integer> list = sortBybitsMap.get(bitLength);
				list.add(i);
				sortBybitsMap.put(bitLength, list);
			} else {
				sortBybitsMap.put(bitLength, new ArrayList<>());
			}

		}

		List<Integer> finalList = new ArrayList<>();
		for (Map.Entry<Integer, List<Integer>> entries : sortBybitsMap.entrySet()) {
			List<Integer> getList = entries.getValue();
			Collections.sort(getList);
			finalList.add(getList);
		}
		return finalList.toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
