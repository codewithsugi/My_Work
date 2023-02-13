package com.sugi.test2;

public class RunLengthEncoding {

	public static void main(String[] args) {

		String test = "aaaabcaaa";

		StringBuilder sb = new StringBuilder();

		char[] inputChars = test.toCharArray();

		int count = 0;

		char prevChar = 0;

		for (char c : inputChars) {
			System.out.println("Im a " + c);
			if (c == prevChar) {
				count++;
			} else if (prevChar != 0) {
				sb.append(count).append(prevChar);
			}
			prevChar = c;
			count = 1;
		}

		sb.append(count).append(prevChar);

		System.out.println(sb);

	}

}
