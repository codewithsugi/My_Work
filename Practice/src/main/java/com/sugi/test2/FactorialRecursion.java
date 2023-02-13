package com.sugi.test2;

public class FactorialRecursion {
	
	
	public static void main(String[] args) {
		
		System.out.println(findFact(10));
		
	}
	
	static int findFact(int n)
	{
		if(n<=1)
			return 1;
		else
			return n*findFact(n-1);
		
	}

}
