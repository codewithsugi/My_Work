package com.sugi.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leet9_PlusOne {

	public static void main(String[] args) {
		int[] test = new Leet9_PlusOne().plusOne(new int[] {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});

		for (int a : test) {
			System.out.println(a);
		}
	}

	public int[] plusOne(int[] digits) {

		List<String> result = new ArrayList<>();
		
		String newValue="";

		for (int i = 0; i < digits.length; i++) {
			result.add(String.valueOf(digits[i]));
		}
		
		for(String wholeValue : result)
		{
			newValue = newValue+wholeValue;
		}
		
		long addByOne = Long.parseLong(newValue)+1;
		
		String value = String.valueOf(addByOne);
		
		System.out.println(value);
		
		int[] finalValue = new int[value.length()];
		
		for(int i=0;i<value.length();i++)
		{
			finalValue[i] = Character.getNumericValue(value.charAt(i));
		}
		
		return finalValue;

	}

}
