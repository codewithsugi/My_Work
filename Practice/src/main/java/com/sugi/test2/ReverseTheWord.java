package com.sugi.test2;

public class ReverseTheWord {
	
	public static void main(String[] args) {
		
		String ut = "we are learning java";
		
		String[] utArr = ut.split(" ");
		
		for(int i = utArr.length - 1;i>=0;i--)
		{
			System.out.print(utArr[i]+" ");
		}
		
	}

}
