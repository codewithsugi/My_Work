package com.sugi.algotest;

import java.util.Arrays;

public class BinarySearchDemo {
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[] {1,334,23,45,32,65,77,234,445,23,544,665,666};
		
		 Arrays.sort(arr);
		 
		 System.out.println(Arrays.toString(arr));
		
		System.out.println(BinarySearch.search(arr, 234));
		
	}

}
