package com.sugi.test;

public class ReverseWordInString {

	public static void main(String[] args) {

		System.out.println(reverseWordInString("today school is leave for the day"));

	}

	public static String reverseWordInString(String str) {
		String[] newString = str.trim().split(" ");

		StringBuilder builder = new StringBuilder();
		for (String s : newString) {
			char[] charArray = s.toCharArray();
			for (int i = charArray.length - 1; i >=0; i--) {
				builder.append(charArray[i]);
			}
			builder.append(" ");
		}

		return builder.toString().trim();
	}
}
