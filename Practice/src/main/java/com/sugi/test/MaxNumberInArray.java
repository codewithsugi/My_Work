package com.sugi.test;

public class MaxNumberInArray {

	public static void main(String[] args) {
		maxNumber(new int[] { 10, 20, 300, 40, 500 });
	}

	public static void maxNumber(int[] arr) {

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			} else
				continue;
		}
		System.out.println("max number in array :: "+max);
		
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			} else
				continue;
		}
		System.out.println("min number in array :: "+min);

	}

}
