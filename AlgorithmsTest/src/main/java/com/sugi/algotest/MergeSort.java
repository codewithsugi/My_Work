package com.sugi.algotest;

import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int[] arr) {

		if (arr.length == 1)
			return arr;

		int mid = arr.length / 2;

		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(left, right);

	}

	public static int[] merge(int[] first, int[] second) {

		int[] joinedArray = new int[first.length + second.length];

		int i = 0, j = 0, k = 0;

		while (i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				joinedArray[k++] = first[i++];

			} else {
				joinedArray[k++] = second[j++];
			}

		}

		while (i < first.length) {
			joinedArray[k++] = first[i++];
		}
		while (j < second.length) {
			joinedArray[k++] = second[j++];

		}

		return joinedArray;
	}

}
