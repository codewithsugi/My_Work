package com.sugi.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountNumberOfSameWords {
	
	
	public static void main(String[] args) {
		
		String test = "I am learning learning java java my boy  boy boy boy good";
		
		Set<String> set = new HashSet();
		
		Map<String,List<String>> map = new HashMap();
		
		String[] a = test.trim().split(" ");
		
		for(String b: a)
		{
			if(!map.containsKey(b))
			{
				map.put(b, new ArrayList<String>());
				set.add(b);
				
			}
			map.get(b).add(b);
		}
		
		System.out.println(map);
		
		for(String b:set)
		{
			System.out.println("Count of the word "+ b+" is :: "+map.get(b).size());
		}
		
	}
	
	

}
