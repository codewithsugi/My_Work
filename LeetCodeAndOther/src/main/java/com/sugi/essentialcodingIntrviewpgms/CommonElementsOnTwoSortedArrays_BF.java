package com.sugi.essentialcodingIntrviewpgms;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsOnTwoSortedArrays_BF {

	public static void main(String[] args) {
		
		findCommonArrayElements(new int[]{1, 3, 6, 7, 9,11}, new int[]{1, 2, 4, 5, 9, 10});

	}

	
	public static List<Integer> findCommonArrayElements(int[] array1, int[] array2)
	{
		
		List<Integer> list = new ArrayList<>();
		
		int i =0, j=0;
		
		while(i<array1.length && j < array2.length)
		{
			if(array1[i] == array2[j])
			{
				list.add(array1[i]);
				i++;
				j++;
			}
			else if(array1[i] > array2[j])
			{
				j++;
			}
			else
			{
				i++;
			}
			
		}
		System.out.println(list);
		
		
		return list;
	}
}
