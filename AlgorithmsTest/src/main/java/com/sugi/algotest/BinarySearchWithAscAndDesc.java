package com.sugi.algotest;

public class BinarySearchWithAscAndDesc {
	
	
	
	public static int search(int arr[], int target)
	{
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsc = false;
		
		if(arr[start]<arr[end])
		{
			isAsc = true;
		}
		
		while(start <= end)
		{
			int mid = (start+end)/2 ;
			
			if(isAsc)
			{
				if(target > arr[mid])
				{
					start = mid+1;
				}
				else if(target < arr[mid])
				{
					end = mid-1;
				}
				else
					return mid;
			}
			else
			{
				if(target > arr[mid])
				{
					end = mid -1;
				}
				else if(target<arr[mid])
				{
					start = mid+1;
				}
				else
					return mid;
				
			}
		}
		
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {10,9,8,7,6,5,4,3};
		
		System.out.println(search(a, 40));
	}

}
