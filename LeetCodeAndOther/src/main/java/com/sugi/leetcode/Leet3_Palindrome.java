package com.sugi.leetcode;

import java.util.ArrayList;

public class Leet3_Palindrome {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(checkPalindrome(1221));
		
		System.out.println(checkPalindromInmyWay(121));
		
		
		
	}
	
	static boolean checkPalindrome(int original)
	{
		 
		int tempOriginal = original;
		int reverseNo =0;
		
		while(tempOriginal > 0)
		{
			int last = tempOriginal % 10;
			
			reverseNo = reverseNo * 10 + last;
			
			tempOriginal = tempOriginal /10;
		}
		
		if(reverseNo == original)
			return true;
		return false;
		
	}
	
	static boolean checkPalindromInmyWay(int n)
	{
		
		String[] givenNumber = new String[1];
		
		givenNumber[0] = String.valueOf(n);
		
		String reverseNumber ="" ;
		
		for(int i = (givenNumber[0].length()) - 1; i >= 0 ;i--)
		{
			
			reverseNumber = reverseNumber + givenNumber[0].charAt(i) ;
		}
		
		
		if(givenNumber[0].equals(reverseNumber))
		 return true;
		
		return false;
		
	}

}
