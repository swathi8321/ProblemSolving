package com.Java.Sorting;

/*4. Median of Two Sorted Arrays
 * 
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 */
public class MedianSort {

	public MedianSort() {
		// TODO Auto-generated constructor stub
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length + nums2.length];
		int nums1Length = nums1.length;
		int nums2Length = nums2.length;

		if (nums1Length == 0) {
			return findMedian(nums2);
		} else if (nums2Length == 0) {
			return findMedian(nums1);
		}

		int shortestLength = (nums1Length > nums2Length ? nums1Length : nums2Length);

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] <= nums2[j]) {
				result[k] = nums1[i];
				i++;

			} else if (nums2[j] < nums1[i]) {
				result[k] = nums2[j];
				j++;

			}

			k++;
			shortestLength--;
		}

		copyOtherElements(i, k, nums1, result);

		copyOtherElements(j, k, nums2, result);

		for (int x : result) {
			System.out.print(x);
		}

		double median = findMedian(result);
		return median;
	}

	private void copyOtherElements(int i, int k, int[] nums, int[] result) {
		while (i < nums.length) {
			result[k] = nums[i];
			i++;
			k++;
		}
	}

	private double findMedian(int[] result) {
		if (result.length == 1) {
			return result[0];
		}
		int mid = result.length / 2;
		double median;

		if (result.length % 2 == 0) {
			median = (double) (result[mid] + result[mid - 1]) / 2;
		} else {
			median = result[mid];
		}
		return median;
	}

	public static void main(String args[]) {
		MedianSort ms = new MedianSort();
		int nums1[] = {};
		int nums2[] = { 2, 3 };

		System.out.println(ms.findMedianSortedArrays(nums1, nums2));
	}

}
