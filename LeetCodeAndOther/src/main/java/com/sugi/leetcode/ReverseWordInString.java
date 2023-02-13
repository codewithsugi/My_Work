package com.sugi.leetcode;

public class ReverseWordInString {
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	public static String reverseWords(String s) {
        
        String[] splitString = s.split(" ");
        StringBuffer buff = new StringBuffer();
        String reverse;
        for(int i=0;i<splitString.length;i++)
        {
        	reverse="";
            for(int j=splitString[i].length()-1;j>=0;j--)
            {
            	
            	reverse += splitString[i].charAt(j);
            }
            buff.append(reverse).append(" ");
        }
        return buff.toString().trim();
    }

}
