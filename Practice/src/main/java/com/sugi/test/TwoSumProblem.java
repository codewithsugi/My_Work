package com.sugi.test;

public class TwoSumProblem {

	public static void main(String[] args) {

		twoSum(new int[] {1,8}, 9);
	}
	
	public static void twoSum(int[] x , int target)
	{
		
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]+x[i+1] == target){
				System.out.println("indexs " +i+","+(i+1));
				
			}
		}
		
	}

}
