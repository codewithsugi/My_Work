package com.sugi.leetcodeDSAGroup;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	/*
	 * Given an integer numRows, return the first numRows of Pascal's triangle.
	 * 
	 * In Pascal's triangle, each number is the sum of the two numbers directly
	 * above it as shown:
	 */
	public static void main(String[] args) {
		generate(5);

	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> mainList = new ArrayList<>();

		for (int i = 1; i <= numRows; i++) {
			List<Integer> subList = new ArrayList<>();
			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i) {
					subList.add(1);
				} else {
					subList.add(mainList.get(i-2).get(j-2)+ mainList.get(i-2).get(j-1));

				}
			}
			mainList.add(subList);
			
		}

		return mainList;
	}

}
