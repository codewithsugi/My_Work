package com.sugi.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckResult {
	
	public static void main(String[] args) {
		
		
		
		int[] test = new CheckResult().plusOne(new int[] {9,9,9});
	
		for (int a : test) {
			System.out.println(a);
		}
	
	}
	
	 public int[] plusOne(int[] digits) {
	        for(int i=digits.length-1;i>=0;i--){
	            if(digits[i]!=9){
	                digits[i]++;
	                return digits;
	            }
	            else
	                digits[i]=0;
	        }
	        int arr[] = new int[digits.length+1];
	        arr[0]=1;
	        return arr;
	    }

}
