package com.sugi.test2;

public class Palindrome {
	
	
	public static void main(String[] args) {
		
		String str = "nitin";
		boolean flag = isPalindrome(str);
		
		if(flag)
		{
			System.out.println("given string palindrome");
		}
		else
		{
			System.out.println("given string not palindrome");
		}
		
		
		
		
	}
	
	static boolean isPalindrome(String str)
	{
		
		if(str == null)
			return false;
		
		if(str.length() == 1)
			return true;
		
		String first = str.substring(0,1);
		String last = str.substring(str.length()-1,str.length());
		if(!first.equals(last))
		{
			return false;
		}
		return isPalindrome(str.substring(1,str.length()-1));
	}
	

}
