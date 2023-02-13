package com.sugi.leetcode;

public class LeetCode_E_twoSum {

	public static void main(String[] args) {

		int[] a = { 20, 3, 2, 7 };

		a = twoSum(a, 9);

		for (int b : a) {
			System.out.println(b);
		}

	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println(i + "  " + j);
					return new int[] { i, j };
				}
			}

		}

		return new int[] { 0, 0 };
	}

}
