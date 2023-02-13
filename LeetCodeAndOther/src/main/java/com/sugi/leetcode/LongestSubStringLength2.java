package com.sugi.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringLength2 {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		//
	}

	public static int lengthOfLongestSubstring(String s) {
		
		
		Map<Character,Integer> map = new HashMap<>();

		if (!s.equals("")) {
			char[] letters = s.toCharArray();
			
			
			for(int i=0;i<letters.length - 1;i++)
			{
				
			}

		}
		return -1;
	}

	public static Set<Character> avoidCharRepeatation(String s) {

		char[] letters = s.toCharArray();

		Set<Character> set = new HashSet();

		if (letters.length > 1) {
			for (int i = 0; i < letters.length; i++) {
				set.add(letters[i]);
			}
		}

		return set;
	}
}
