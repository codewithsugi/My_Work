package com.sugi.test;

public class reverseANumber {

	public static void main(String[] args) {
		
		System.out.println(reverseNumber(121));

	}
	
	public static String reverseNumber(int num)
	{
		int reverse=0;
		int original = num;
		while(num>0)
		{
			
			reverse = reverse * 10 + num % 10; //rev = 22
			num = num /10; // num = 12/10
		}
		
		System.out.println(reverse);
		if(original == reverse)
			return "Palindrome";
		
		return "Not Palindrome";
	}

}
