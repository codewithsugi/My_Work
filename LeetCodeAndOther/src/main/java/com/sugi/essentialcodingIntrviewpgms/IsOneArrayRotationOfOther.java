
package com.sugi.essentialcodingIntrviewpgms;

public class IsOneArrayRotationOfOther {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array2a = { 4, 5, 6, 7, 8, 1, 2, 3 };
		// isRotation(array1, array2a) should return false.
		int[] array2b = { 4, 5, 6, 7, 1, 2, 3 };
		// isRotation(array1, array2b) should return true.
		int[] array2c = { 4, 5, 6, 9, 1, 2, 3 };
		// isRotation(array1, array2c) should return false.
		int[] array2d = { 4, 6, 5, 7, 1, 2, 3 };
		// isRotation(array1, array2d) should return false.
		int[] array2e = { 4, 5, 6, 7, 0, 2, 3 };
		// isRotation(array1, array2e) should return false.
		int[] array2f = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(isRotation(array1, array2b));
		
		

	}

	public static boolean isRotation(int[] arr1, int[] arr2) {
		boolean isRotation = false;
		if (arr1.length != arr2.length)
			return isRotation;

		int difference = arr2[0] - arr1[0];
		int maxAllowedDifference = difference + 1;

		for (int i = 0; i < arr2.length; i++) {

			if (arr1[i] > arr2[i]) {
				if ((arr1[i] - arr2[i] == difference) || (arr1[i] - arr2[i] == maxAllowedDifference)) {
					isRotation = true;
					continue;
				} else {
					isRotation = false;
					break;
				}
			} else {
				if ((arr2[i] - arr1[i] == difference) || (arr2[i] - arr1[i] == maxAllowedDifference)) {
					isRotation = true;
					continue;
				} else {
					isRotation = false;
					break;
				}
			}

		}

		return isRotation;
	}

}
