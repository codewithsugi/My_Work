package com.sugi.essentialcodingIntrviewpgms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingChar {

	public static void main(String[] args) {
		System.out.println(nonRepeatChar("aabbdbc"));
		
		/*
		 * nonRepeating("abcab"); // should return 'c' nonRepeating("abab"); // should
		 * return null nonRepeating("aabbbc"); // should return 'c'
		 * nonRepeating("aabbdbc"); // should return 'd'
		 */	}

	public static char nonRepeatChar(String a) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char nonRepeat = 0;

		for (int i = 0; i < a.length(); i++) {

			if (!map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), 1);
			} else {
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
			}
		}
		
		for(Entry entry : map.entrySet())
		{
			if((int)entry.getValue() == 1)
			{
				nonRepeat = (char)entry.getKey();
				break;
			}
		}
		

		

		return nonRepeat;
	}

}
