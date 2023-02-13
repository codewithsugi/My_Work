package com.sugi.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leet6_LongestPrefix {
	
	
	public static void main(String[] args) {
		commonPrefix(new String[] {"flower","flowt","flight"});
	}
	
	
	static void commonPrefix(String[] strs) {
		
		Stack<Character> commonPrefixStack = new Stack<>();
		
		// first iterate first and second string and find the common chars
		
		for(int i=0;i<strs.length-1;i++)
		{
			System.out.println(strs[i].indexOf(strs[0]));
			char[] firstString = strs[i].toCharArray();
			char[] secondString = strs[i+1].toCharArray();
			
			for(int j=0;j<firstString.length;j++)
			{
				if(firstString[j] == secondString[j])
				{
					if(commonPrefixStack.contains(firstString[j]))
					{
						continue;
					}
					else
					{
						commonPrefixStack.add(firstString[j]);
					}		
				}
				else
				{
					if(commonPrefixStack.contains(firstString[j]))
					{
						commonPrefixStack.pop();
					}
					else
					{
						break;
					}
				}
			}
		}
		
		System.out.println(commonPrefixStack);
		
		
		
		
	}

}
