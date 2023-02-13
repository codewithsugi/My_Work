package com.sugi.test2;

public class LargestInTheArray {
	
	public static void main(String[] args) {
		
		
		int[] nums = {10,3,4,5,2,66,3444,234,453,3444};
		
		int smallest = nums[0];
		
		int largest = nums[0];
		
		
		for(int i =0; i<nums.length;i++)
		{
			if(nums[i] >= largest)
			{
				largest = nums[i];
				
			}
			else
				smallest = nums[i];
		}
		
		System.out.println(largest);
		
		System.out.println(smallest);
		
		
	}

}
