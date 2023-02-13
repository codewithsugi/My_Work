package com.sugi.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leet8_LengthOfLastWord {
	
	
	public static void main(String[] args) {
		System.out.println(new Leet8_LengthOfLastWord().lengthOfLastWord("    day"));
	}
	
	 public int lengthOfLastWord(String s) {
		 
		 s= s.trim();
		 char current;
		 
		 List<Character> list = new ArrayList<Character>();
		 
		System.out.println(s.length()-1);
		 
		 for(int i=s.length()-1;i>=0 ;i--)
		 {
			 current = s.charAt(i);
			 if(current != ' ')
				 list.add(current);
			 else
				 break;
			 
		 }
		 System.out.println(list);
		 
		 return list.size();
	        
	    }
	
	

}
