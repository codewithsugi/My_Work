package com.sugi.essentialcodingIntrviewpgms;

import java.util.HashMap;
import java.util.Map;
public class MaxOccuranceInArray {

	public static void main(String[] args) {
		
		int[] a = {1, 3, 1, 3, 2, 1,4,54,3,2,5,2,2,3,33,22,2222,33};

		System.out.println(maxOccur(a));

	}
	
	
	
	public static int maxOccur(int[] givenArray)
	{
		Map<Integer,Integer> map = new HashMap<>();
		
		int maxCount = 0, maxItem =0; 
		
		
		for(int i=0;i<givenArray.length;i++)
		{
			if(map.containsKey(givenArray[i]))
			{
				map.put(givenArray[i],map.get(givenArray[i])+1);
			}
			else
			{
				map.put(givenArray[i], 1);
			}
			
			if(map.get(givenArray[i]) > maxCount)
			{
				maxCount = map.get(givenArray[i]);
				maxItem = givenArray[i];
			}
		}
		
		return maxItem;
	}

}
