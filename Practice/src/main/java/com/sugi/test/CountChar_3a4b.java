package com.sugi.test;

public class CountChar_3a4b {

	public static void main(String[] args) {

		CountChar("ab");

	}

	public static void CountChar(String word) {
		char[] charArray = word.toCharArray();
		// aaabbc

		int counter = 1;

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == charArray[i + 1]) {
				counter++;
			} else {
				builder.append(counter).append(charArray[i]);
				counter = 1;
			}
		}
		builder.append(counter).append(charArray[charArray.length - 1]);
		System.out.println(builder);
	}

}
