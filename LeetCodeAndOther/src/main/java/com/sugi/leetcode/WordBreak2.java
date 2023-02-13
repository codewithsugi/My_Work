package com.sugi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak2 {

	public static void main(String[] args) {
		
		String s = "catsanddog";
		
		List<String> wordDict = new ArrayList(Arrays.asList("cat","cats","and","sand","dog"));
		
		for(String found : wordDict)
		{
			boolean flag = s.contains(found);
			
			if(flag)
			{
				System.out.println(found);
			}
		}

	}

}
