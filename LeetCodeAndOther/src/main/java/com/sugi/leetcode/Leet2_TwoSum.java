package com.sugi.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leet2_TwoSum {

	public static void main(String[] args) {

		Leet2_TwoSum sum = new Leet2_TwoSum();

		int[] test = sum.twoSum(new int[] {2,5,5,11}, 10);

		System.out.println(test[0] + " " + test[1]);

	}

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length;++j)
			{
				 if (nums[j] == target - nums[i])
					 return new int[] { i, j };
				
			}
		}
		return null;

		
	}

}
