package com.sugi.leetcodeDSAGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		
		//int[] num = {3,2,2,3};
		int[] num = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(num, 2));

	}

	public static int removeElement(int[] nums, int val) {

		int count =0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] - val != 0) {
				nums[count++] = nums[i];
			}
			
		}

		return count;
	}

}
