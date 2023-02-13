package com.sugi.test2;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String underTest = "programming";
		
		String reverse = "";
		//char[] charArr = underTest.toCharArray();
		
		for(int i=underTest.length()-1;i>=0;i--)
		{
			reverse = reverse+underTest.charAt(i);
		}
		
		System.out.println(reverse);
		
	}

}
