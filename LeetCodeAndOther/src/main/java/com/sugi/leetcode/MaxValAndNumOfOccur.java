package com.sugi.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxValAndNumOfOccur {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 3, 5, 5, 5};
		
		System.out.println(Arrays.toString(maxValNumOfOccurrences(a)));
	}
	
	
	
	
	    public static int[] maxValNumOfOccurrences(int[] nums) {
	        
	        int maxValue = 0;
	        Map<Integer,Integer> map = new HashMap<>();
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i] > maxValue)
	            {
	                maxValue = nums[i];
	            }
	            if(map.containsKey(nums[i]))
	            {
	            	map.put(nums[i], map.get(nums[i])+1);
	            }
	            else
	            {
	            	map.put(nums[i],1);
	            }
	            
	        }
	        return new int[]{maxValue,map.get(maxValue)};
	        
	    }
	

}
