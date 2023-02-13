package com.sugi.test2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateNumberInArray {
	
	public static void main(String[] args) {
		
		Integer[] test = {10,3,4,5,6,3,4,56,2,33,555,66,33,3};
		 Set<Integer> unique = new TreeSet(Arrays.asList(test));
		  
		  System.out.println(unique);
		  
		  for(int a : unique) { System.out.print(a+" "); }
		 
		
		
		
		
	}

}
