package com.sugi.test;

import java.util.Arrays;

public class reverseAnIntArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseArray(new int[] { 1, 2, 39, 4 })));
	}

	public static int[] reverseArray(int[] nums) {
		int j = nums.length - 1;

		// our loop will go till half of our input array
		// 'i' is a pointer that will start from the beginning
		for (int i = 0; i < nums.length / 2; i++) {
			// swap elements using positions of i and (j - i)
			int tmp = nums[i];
			nums[i] = nums[j - i];
			nums[j - i] = tmp;
		}

		return nums;
	}
}
