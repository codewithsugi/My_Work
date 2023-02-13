package com.sugi.test2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindFirstuniqueChar {

	public static void main(String[] args) {

		String test = "programmingp";

		Set<Character> unique = new LinkedHashSet();

		char[] charArr = test.toLowerCase().toCharArray();

		for (char got : charArr) {
			boolean flag = unique.add(got);

			if (flag == false) {
				unique.remove(got);
			}
		}
		
		for(char first : unique)
		{
			System.out.println(test.indexOf(first));
			System.out.println(test.charAt(test.indexOf(first)));
			break;
			
			
		}

	}

}
