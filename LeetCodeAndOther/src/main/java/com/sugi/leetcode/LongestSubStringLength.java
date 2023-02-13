package com.sugi.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringLength {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		//
	}

	public static int lengthOfLongestSubstring(String s) {

		if (!s.equals("")) {

			char[] letters = s.toCharArray();

			Set<Character> set = new HashSet<>();

			Map<Set<Character>, Integer> map = new HashMap<>();

			if (letters.length == 1) {
				return 1;
			}

			for (int i = 0; i < letters.length; i++) {
				set.add(letters[i]);
			}

			if (set.size() == 1 || set.size() == 2) {
				return set.size();
			}

			int beginIndex = 0;
			int endIndex = 0;

			int i = 0;
			boolean flag = false;

			while (i < letters.length - 1) {
				if (letters[i] != letters[i + 1]) {
					endIndex++;
				} else {
					flag = true;
					map.put(avoidCharRepeatation(s.substring(beginIndex, endIndex)),
							avoidCharRepeatation(s.substring(beginIndex, endIndex)).size());
					if (i == letters.length - 2) {
						break;
					}
					beginIndex = endIndex + 1;
				}

				i++;
			}

			if (letters[letters.length - 2] != letters[letters.length - 1] && flag == true) {
				endIndex += 2;

			} else {
				endIndex++;
			}
			map.put(avoidCharRepeatation(s.substring(beginIndex, endIndex)),
					avoidCharRepeatation(s.substring(beginIndex, endIndex)).size());
			int longValue = 0;
			for (Integer value : map.values()) {
				if (value > longValue)
					longValue = value;
			}
			return longValue;
		} else {
			return -1;
		}
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
