package com.sugi.test;

public class ThreeIntergerSumEqualToTarget {
	
	
	public static void main(String[] args) {
		System.out.println(SumOfThree(new int[] {10,20,30,40,50}, 90));
	}

	
	public static boolean SumOfThree(int[] nums, int target)
	{
		// [10,20,30,40]  , 50  --(10 , 30 
		
		int sum =0;
		for(int i=0; i< nums.length-1;i++)
		{
			for(int j=i+1;j< nums.length-1;j++)
			{
				for(int k=j+1;k< nums.length;k++)
				{
					sum = nums[i]+nums[j]+nums[k];
					if(sum == target)
					{
						System.out.println("index : "+i+" "+j+" "+k);
						return true;
					}
					else
						sum=0;
				}
			}
		}
		return false;
	}
}
