package com.sugi.codesigna;

public class GivenNReturnHighestNumber {
	
	public static void main(String[] args) {
		System.out.println(test(9));
	}
	
	public static int test(int n)
	{
		return (int) Math.pow(10, n)-1;
	}

}
