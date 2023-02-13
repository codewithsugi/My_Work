package com.sugi.test2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		String test = "welcome welcome";
		
		int count = test.length() - test.replaceAll("e", "").length();
		
		System.out.println(count);
		
		
	}

}
