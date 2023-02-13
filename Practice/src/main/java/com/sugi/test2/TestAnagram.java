package com.sugi.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnagram {
	
	
	public static void main(String[] args) {
		
		String a ="test";
		String b = "tset";
		
		char[] aArr = a.toLowerCase().toCharArray();
		
		char[] bArr= b.toLowerCase().toCharArray();

		Arrays.sort(aArr);
		Arrays.sort(bArr);
		
		System.out.println(aArr);
		
		boolean test = Arrays.equals(aArr, bArr);
		
		System.out.println(test);
		
		if(test)
		{
			System.out.println("String "+ a + " String "+b+" are anagram");
			
		}
		
		
		
	}

}
