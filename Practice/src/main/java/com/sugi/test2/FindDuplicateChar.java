package com.sugi.test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateChar {

	public static void main(String[] args) {

		String test = "laptopl";

		char[] testing = test.toCharArray();

		Set<Character> a = new HashSet();

		for (char b : testing) {

			boolean result = a.add(b);
			if(result == false)
			{
				System.out.println("duplicate char "+b);
			}
		}
		
		
		
		
	
		
		
	}

}
