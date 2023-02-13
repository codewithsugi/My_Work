package com.sugi.algotest;

import java.time.chrono.MinguoDate;

public class BinarySearch {
	
	
	// assumed that the input array should be a sorted array.
	// for binary search technique we should always use sorted array
	// time complexity is o(log2 n)
	
	
	public static int search(int[] arr, int target)
	{
		int startIndex = 0;
		int endIndex = arr.length -1;
		
		while(startIndex <= endIndex)
		{
			int midIndex = (startIndex+endIndex) / 2;
			
			if(target > arr[midIndex])
			{
				startIndex = midIndex+1;
			}
			else if(target < arr[midIndex])
			{
				endIndex = midIndex - 1;
			}
			else
				return midIndex;
			
		}
		
		return -1;
	}

}
