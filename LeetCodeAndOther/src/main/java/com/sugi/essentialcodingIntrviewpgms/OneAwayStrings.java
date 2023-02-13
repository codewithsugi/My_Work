package com.sugi.essentialcodingIntrviewpgms;

public class OneAwayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isOneAway("abcde", "abcd")); // should return true
		System.out.println(isOneAway("abde", "abcde")); // should return true
		System.out.println(isOneAway("a", "a")); // should return true
		System.out.println(isOneAway("abcdef", "abqdef")); // should return true
		System.out.println(isOneAway("abcdef", "abccef")); // should return true
		System.out.println(isOneAway("abcdef", "abcde")); // should return true
		System.out.println(isOneAway("aaa", "abc")); // should return false
		System.out.println(isOneAway("abcde", "abc")); // should return false
		System.out.println(isOneAway("abc", "abcde")); // should return false
		System.out.println(isOneAway("abc", "bcc")); // should return false

	}

	public static Boolean isOneAway(String s1, String s2) {

		// if the length is not equal then we can say false
		if (s1.equals("") || s2.equals("")) {
			return false;
		}

		if (s1.equals(s2)) {
			return true;
		}

		// iterate the char and seperate the char which gives != 0 when subtract

		int count = 0;
		char fromFirst, fromSecond;
		int firstIndex, secondIndex;

		for (int i = 0; i < Math.max(s1.length(),s2.length()); i++) {
			if (s1.charAt(i) - s2.charAt(i) == 0) {
				continue;
			} else {
				count++;
				fromFirst = s1.charAt(i);
				fromSecond = s2.charAt(i);
				firstIndex = i;
			}
		}

		if (count == 1) {
			return true;
		}

		return false;
	}

}
