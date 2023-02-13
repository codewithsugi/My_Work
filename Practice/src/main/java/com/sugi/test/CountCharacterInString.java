package com.sugi.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterInString {

	public static void main(String[] args) {
		countChar("aaaaaa");
	}

	public static void countChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
				map.put(ch,1);

		}
		
		System.out.println(map);

	}

}
