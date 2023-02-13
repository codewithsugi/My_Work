package com.sugi.test2;

public class ReverseLettersInGivenWord {
	
	public static void main(String[] args) {
		
		String ut = "How are you";
		
		String reversed = "";
		
		String[] utArr = ut.split(" ");
		
		for(String underTest : utArr)
		{
			for(int i = underTest.length() -1 ;i>=0;i--)
			{
				reversed +=underTest.charAt(i);		
			}
			reversed +=" ";
		} 
		
		System.out.println(reversed);
		
	}

}
