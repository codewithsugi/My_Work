package com.sugi.leetcodeDSAGroup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DSA_1_LongestSubstringwithoutRepeatingChar {
	
	public static void main(String[] args) {
		
		System.out.println(longestSubStringLengthSecond("abcabcbb	"));
		
	}
	
	
	
	public static int longestSubStringLength(String str)
	{
		
		//Map<Character, Integer> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		
		int i =0 ,j=0, max=0;
		
		
		while(j< str.length())
		{
			if(!set.contains(str.charAt(j)))
			{
				set.add(str.charAt(j));
				max= Math.max(max,set.size());
				j++;
			}
			else
			{
				set.remove(str.charAt(i));
				i++;
			}
		}
		
		
		
		return max;
	}
	
	
	public static int longestSubStringLengthSecond(String s)
	{
		int n = s.length(), longest = 0;
		int[] nextIndex = new int[128]; 

		for (int r=0, l=0; r<n; r++) {
			System.out.println(Arrays.toString(nextIndex));
			l = Math.max(nextIndex[s.charAt(r)], l); 
			longest = Math.max(longest, r - l + 1);
			nextIndex[s.charAt(r)] = r + 1;
		}

		return longest;
	}
	

}
