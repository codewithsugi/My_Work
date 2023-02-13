package com.sugi.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfSameWords {

	public static void main(String[] args) {
		String test = "I am learning learning java java my boy boy boy boy good";
		
		sameWordsCount(test);
	}
	
	
	public static void sameWordsCount(String str)
	{
		
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();
		
		String[] splitedString = str.split(" ");
		
		for(String s : splitedString)
		{
			if(!map.containsKey(s))
			{
				map.put(s,1);
			}
			else
			{
				map.put(s,map.get(s)+1);
			}
		}
		
		System.out.println(map);
		
	}

}
