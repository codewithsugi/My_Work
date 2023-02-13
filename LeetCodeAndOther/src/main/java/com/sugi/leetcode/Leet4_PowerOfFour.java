package com.sugi.leetcode;

public class Leet4_PowerOfFour {

	public static void main(String[] args) {
		
		System.out.println(checkPowerOf4(-2147483648));
		

	}
	
	// Returns true if `n` is a power of four
    public static boolean checkPowerOf4(int n)
    {
        // find `log4(n)`
        double i = Math.log(n) / Math.log(4);
 
        // return true if `log4(n)` is an integer
        return i == Math.floor(i);
    }
 
   
}
