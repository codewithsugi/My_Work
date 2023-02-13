package com.sugi.test;

public class PalindromeString {
	
	
	public static void main(String[] args) {
		
		System.out.println(palindromeString("amma"));
	}
	
	public static String palindromeString(String word)
	{
		char[] charArray = word.toCharArray();
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			builder.append(charArray[i]);
		}
		
		if(word.equalsIgnoreCase(builder.toString()))
			return "Palindrome";
		
		return "Not Palindrome";
	}

}
