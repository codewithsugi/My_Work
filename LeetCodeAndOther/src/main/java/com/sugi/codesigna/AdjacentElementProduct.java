package com.sugi.codesigna;

import java.util.Set;
import java.util.TreeSet;

public class AdjacentElementProduct {
	
	public static void main(String[] args) {
		
		int prod;
		int maxValue = -99999;
		//int maxNegativeValue=-99999;
		int inputArray[] = {-23, 4, 3, 8, -12};
		
		for(int i=0;i<inputArray.length-1;i++)
		{
			prod = inputArray[i] * inputArray[i+1];
			
			if(maxValue < prod)
			{
				maxValue = prod;
			}
			else if(maxValue < prod)
			{
				maxValue = prod;
			}
		}
		
	System.out.println(maxValue);
	//System.out.println(maxNegativeValue);
		
	}

}
