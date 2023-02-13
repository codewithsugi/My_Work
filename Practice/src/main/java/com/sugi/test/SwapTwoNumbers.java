package com.sugi.test;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		swapWithTemp(10, 20);
		swapWithoutTemp(10, 20);
		

	}
	
	public static void swapWithTemp(int x, int y)
	{
		int temp;
		
		System.out.println("Before Swap x : "+x);
		System.out.println("Before Swap y : "+y);
		
		temp = x;
		
		x=y;
		
		y = temp;
		
		System.out.println("After Swap x : "+x);
		System.out.println("After Swap y : "+y);
	}
	
	
	public static void swapWithoutTemp(int x, int y)
	{
		System.out.println("Before Swap x No Temp: "+x);
		System.out.println("Before Swap y : "+y);
		
		x = x+y;  // 10 , 20 -- > 30
		
		y = x-y;  // 30 - 20 = 10 
		
		x = x-y;
		
		System.out.println("After Swap x No Temp: "+x);
		System.out.println("After Swap y : "+y);
		
	}

}
