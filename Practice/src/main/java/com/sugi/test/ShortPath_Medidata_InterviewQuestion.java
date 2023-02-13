package com.sugi.test;

public class ShortPath_Medidata_InterviewQuestion {

	public static void main(String[] args) {

		int[] nums = { 13, 53, 6, 192, 28 ,30};
		int lowValue;
		int diff;
		int num1=0 , num2=0;
		if (nums[0] > nums[1]) {
			lowValue = nums[0] - nums[1];
		} else {
			lowValue = nums[1] - nums[0]; // 40
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length && i != j; j++ ) {
				if (nums[i] > nums[j]) // 13>6
				{
					diff = nums[i] - nums[j]; // 7
					num1= nums[i];
					num2=nums[j];
					if (diff < lowValue) // 40
					{
						lowValue = diff; // 7
					}
				} else {
					diff = nums[j] - nums[i]; // 53 - 13 = 40
					num1= nums[i];
					num2=nums[j];
					if (diff < lowValue) // 40
					{
						lowValue = diff;
					}
				}
			}

			
		}
		
		System.out.println("Number 1 :: "+num1+ " Number 2 :: "+num2+"Short Path " + lowValue);

	}

}
