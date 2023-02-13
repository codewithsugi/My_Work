package com.sugi.leetcodeDSAGroup;

import java.util.HashSet;
import java.util.Set;

public class DSA_3_LongestCommonPrefix {

	public static void main(String[] args) {

		//String[] strs = { "flower", "flow", "flight" };
		
		
		String[] strs = { "ab","a"};

		System.out.println(commonPrefix(strs));

	}

	public static String commonPrefix(String[] str) {

		StringBuffer common = new StringBuffer();

		String checking = str[0];
		int length = checking.length();
		int found = 1;
		int i = 0;

		for (int j = 1; j < str.length; j++) {

			if (checking.charAt(i) == str[j].charAt(i)) {
				found++;
				if (str.length == found) {
					common.append(checking.charAt(i));
					found = 1;
					i++;
					j=0;
				}
				continue;

			}
		}

		return common.toString();
	}

}
