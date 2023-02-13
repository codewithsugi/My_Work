package com.sugi.algotest;

import java.util.Arrays;

public class SelectionSortExample {

	/*
	 * {10,6,2,34,4,5,6}
	 * 
	 * take first index and compare from index 1 to till length of the array
	 * 
	 */

	public static int[] sorting(int[] arr) {

		// step 1
		for (int i = 0; i < arr.length; i++) {
			int minValueIndex = i;  // this is the selected Index 
			for (int j = i+1; j < arr.length; j++) { // 10 > 2
				if(arr[minValueIndex] > arr[j])  
				{
					minValueIndex =j; // j=2 (
					
				}
			}
			int temp = arr[i];
			arr[i] = arr[minValueIndex];
			arr[minValueIndex] = temp;
			
			
		}

		return arr;

	}

	public static void main(String[] args) {

		int a[] = { 10, 7, 2, 34, 4, 5, 6 };
		System.out.println(Arrays.toString(sorting(a)));
	}

}
