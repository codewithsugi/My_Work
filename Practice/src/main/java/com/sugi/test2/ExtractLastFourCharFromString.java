package com.sugi.test2;

public class ExtractLastFourCharFromString {
	
	
	public static void main(String[] args) {
		
		String test = "www.google.com";
		System.out.println(test.substring((test.length() - 4 ), test.length()));
	}

}
