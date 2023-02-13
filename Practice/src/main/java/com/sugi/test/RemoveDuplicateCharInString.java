package com.sugi.test;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		removeDup("illness");
	}

	public static void removeDup(String str) {
		char[] charArray = str.toCharArray();

		String noDuplicate = "";

		for (char ch : charArray) {
			if (!noDuplicate.contains(String.valueOf(ch))) {
				noDuplicate += ch;
			}
		}
		
		System.out.println(noDuplicate);
	}

}
