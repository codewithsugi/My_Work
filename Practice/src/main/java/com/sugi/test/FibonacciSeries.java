package com.sugi.test;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		fibonacci(10);
	}
	
	public static void fibonacci(int n)
	{
		int num1 = 0;
		int num2 = 1;
		int sum;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(num1+" ");
			
			sum = num1+num2;
			
			num1 = num2;
			num2 = sum;
		}
	}

}
