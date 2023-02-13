package com.sugi.codesigna;

public class ShapeArea {

	public static void main(String[] args) {
		
		solution(2);
		
		/*
		 * 
		 * 1 -- 1
		 * 2 -- 1,3,1
		 * 3 ---1,3,5,3,1
		 * 4---1,3,5,7,5,3,1
		 * 
		 */
		
		

	}
	
	static int solution(int n) {
	    
		for(int i=0;i<n;i+=2)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		
		return n;

	}


}
