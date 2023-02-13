package com.sugi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {

		System.out.println(removeDuplicates(new int[] { 1, 1, 4 }));

	}

	public static int removeDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int count = 0;

		for (int num : nums) {
			boolean flag = set.add(num);
			if (flag) {
				continue;
			} else {
				count++;
			}
		}

		return set.size();

	}

}
