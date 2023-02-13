package com.sugi.leetcodeDSAGroup;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4 };
		System.out.println(Arrays.toString(plusOne(a)));

	}

	public static int[] plusOneFirst(int[] nums) {
		String num = "";

		for (int i = 0; i < nums.length; i++) {

			num += String.valueOf(nums[i]);
		}

		String num1 = String.valueOf(Integer.valueOf(num) + 1);

		int[] plusOne = new int[num1.length()];

		for (int i = 0; i < num1.length(); i++) {
			plusOne[i] = num1.charAt(i) - 48;
		}

		return plusOne;
	}

	public static int[] plusOne(int[] nums) {

		int lastIndex = nums.length - 1;
		int carry = 0;
		boolean flag = false;
		// if the last index != 8 then we can increase 1 directly 0(1)
		if (nums[lastIndex] != 9)
			nums[lastIndex] = nums[lastIndex] + 1;
		else {
			while (lastIndex >= 0) { // looping for == 9 testcases
				if (nums[lastIndex] == 9) { // if the current index from last is == 9
					int newValue = nums[lastIndex] + 1;
					nums[lastIndex] = newValue % 10;
					if (lastIndex == 0 && nums[lastIndex] < 9) {
						carry = newValue / 10;
					}

				} else { // break will cover the tc 989
					nums[lastIndex] = nums[lastIndex] + 1;
					break;

				}
				lastIndex--;

			}

			if (carry > 0) {
				nums = new int[nums.length + 1];
				nums[0] = 1;
			}

		}

		return nums;
	}

}
