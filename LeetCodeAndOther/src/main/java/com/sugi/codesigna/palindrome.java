package com.sugi.codesigna;

public class palindrome {

	public static void main(String[] args) {

		String inputString = "amma";
		String reverse = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverse = reverse + inputString.charAt(i);

		}
		if(inputString.equals(reverse))
		{
			System.out.println("cool");
		}

	}

}
