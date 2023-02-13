package com.sugi.algotest;

import java.util.Arrays;

public class BubbleSort {

	public static int[] sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}

		}

		return arr;
	}
	
	
	
	public static void main(String[] args) {
		
		
		int[] a = {10,4,3,6,7,8,9,1,0};
		
		System.out.println(Arrays.toString(sort(a)));
	}
}
