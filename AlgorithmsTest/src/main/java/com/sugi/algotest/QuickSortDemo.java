package com.sugi.algotest;

import java.util.Arrays;

public class QuickSortDemo {
	
	public static void main(String[] args) {
		
		//5,8,4,3,7,6,2,9,5
		int[] arr = new int[] {121,343,222,4445,4443,5564,3334,6564643,2242};
		
		QuickSort.quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
