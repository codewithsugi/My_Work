package com.sugi.leetcodeDSAGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class SortTheArrayWhichHasOnly1And2And3 {

	/*
	 * Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list
	 * in O(n) time. Example 1: Input: [3, 3, 2, 1, 3, 2, 1] Output: [1, 1, 2, 2, 3,
	 * 3, 3]
	 * 
	 */

	public static void main(String[] args) {

		List a = new ArrayList();
		a.add(3);
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(1);
		
		//System.out.println(sortArrayNew(a));
		//sortArrayNew(a);
		
		//int[] test = {3, 3, 2, 1, 3, 2, 1};
		
		//int[] test = {3};
		
		//int[] test = {3, 3, 3,3,3,3,3,3};
		
		//int[] test = {1, 2,3};
		
		int[] test = {3, 2,1,1,1,1,1,1};
		
		
		System.out.println(Arrays.toString(sortArrayFinal(test)));
	}

	public static List<Integer> sortArray(List<Integer> list) {

		List<Integer> oneList = new ArrayList<>();

		List<Integer> twoList = new ArrayList<>();

		List<Integer> threeList = new ArrayList<>();

		List<Integer> finalList = new ArrayList<>();

		for (int a : list) {
			if (a == 1) {
				oneList.add(a);
			} else if (a == 2) {
				twoList.add(a);
			} else {
				threeList.add(a);
			}
		}
		finalList.addAll(oneList);
		finalList.addAll(twoList);
		finalList.addAll(threeList);

		return finalList;
	}
	
	public static List<Integer> sortArrayNew(List<Integer> list) {
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		

		for (int a : list) {
			
			if(!map.containsKey(a))
			{
				map.put(a, new ArrayList<Integer>());
			}
			map.get(a).add(a);
			
		}
		
		// we are taking the entry set and getting the values using flap map to collect as List
		return map.entrySet().stream().flatMap(e->e.getValue().stream()).collect(Collectors.toList());
	}
	
	
	public static int[] sortArrayThree(int[] array) {
		
		int[] sortedArray = new int[array.length];
		
		int oneIndex = 0;
		
		int threeIndex = array.length-1;
		
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == 1)
			{
				sortedArray[oneIndex] = array[i];
				oneIndex++;
			}
			else if(array[i] == 3)
			{
				sortedArray[threeIndex] = array[i];
				threeIndex--;
			}
		}
		
		for(int i=0;i<sortedArray.length;i++)
		{
			if(sortedArray[i] == 0)
			{
				sortedArray[i] = 2;
			}
		}
		return sortedArray;
	}
	
	public static int[] sortArrayFinal(int[] array) {
		
		int onesCount = 0;
		
		int twosCount=0;
		
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == 1)
			{
				onesCount++;  //2
			}
			else if(array[i] == 2)
			{
				twosCount++; //2
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			if(i< onesCount)
			{
				array[i] = 1;
			}
			else if(i >= onesCount && i < (onesCount+twosCount))
			{
				array[i] = 2;
			}
			else
				array[i] = 3;
		}
		return array;
	}

}
