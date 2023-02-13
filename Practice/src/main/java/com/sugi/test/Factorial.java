package com.sugi.test;

public class Factorial {

	public static void main(String[] args) {
		fact(5);
		System.out.println(findFact(0));
	}

	public static void fact(int n) {
		// 5 = 5 * 4 * 3 * 2 * 1

		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

	
	public static int findFact(int n)
	{
		if(n<1)
			return 1;
		else
			return n*findFact(n-1);
		
	}
}
