package com.sugi.test;

import java.util.Stack;

public class Balanced_Paranthesis {

	public boolean isValidOther(String s) {

		Stack<Character> insertBrackets = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.length() == 1) {
				return false;
			}
			if (s.length() == 2 && (s.charAt(0) == s.charAt(1)) || (s.charAt(0) == ')') || (s.charAt(0) == '}')
					|| (s.charAt(0) == ']')) {
				return false;
			}
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				insertBrackets.push(s.charAt(i));
			} else {
				if (insertBrackets.isEmpty()) {
					return false;
				}
				char check = insertBrackets.pop();

				if (check == '(' && s.charAt(i) == ')' || check == '{' && s.charAt(i) == '}'
						|| check == '[' && s.charAt(i) == ']') {
					continue;
				} else
					return false;

			}
		}
		if(insertBrackets.isEmpty())
			return true;
		else
			return false;
	}

	

	public static void main(String[] args) {

		System.out.println(new Balanced_Paranthesis().isValidOther("{)"));
	}

}
