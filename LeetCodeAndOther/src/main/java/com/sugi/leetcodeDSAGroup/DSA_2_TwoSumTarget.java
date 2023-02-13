package com.sugi.leetcodeDSAGroup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DSA_2_TwoSumTarget {

	public static void main(String[] args) {

		int[] a = { 3, 4, 5, 16, 8 };
		int target = 10;
		
		System.out.println(Arrays.toString(twoSumSolution(a, target)));

	}

	public static int[] twoSumSolution(int[] a,int target)
	{
		Map<Integer, Integer> map = new HashMap<>();
 		
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(target-a[i])) {
				return new int[] {map.get(target-a[i]), i};
			}
			map.put(a[i],i);
			
		}
		
		return new int[] {0,0};
		
	}
}
