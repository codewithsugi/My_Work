package com.sugi.leetcodeDSAGroup;

import java.util.Arrays;

public class AddBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("111", "1011"));
	}

	public static String addBinaryFirst(String a, String b) {

		char carry = '0';

		int firstLength = a.length();
		int secondLength = b.length();
		StringBuffer result = new StringBuffer();
		char[] firstArray = a.toCharArray();
		char[] secondArray = b.toCharArray();
		char[] newArray = null;

		if (firstLength > secondLength) {
			newArray = new char[firstLength];
			int i = firstArray.length - 1;
			while (i >= 0) {
				try {
					newArray[i] = secondArray[secondLength - 1];
				} catch (Exception e) {
					newArray[i] = '0';

				}
				i--;
				secondLength--;
			}

			b = new String(newArray);

		} else if (firstLength < secondLength) {
			newArray = new char[secondLength];
			int i = secondArray.length - 1;
			while (i >= 0) {
				try {
					newArray[i] = firstArray[firstLength - 1];
				} catch (Exception e) {
					newArray[i] = '0';

				}
				i--;
				firstLength--;
			}
			a = new String(newArray);
		}

		System.out.println(Arrays.toString(newArray));
		System.out.println(a + "  " + b);

		for (int i = Math.max(firstLength - 1, secondLength - 1); i >= 0; i--) {

			if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == '1') {
				result.append(1);
				carry = '1';
			} else if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == '0') {
				result.append(0);
				carry = '1';
			} else if (a.charAt(i) == '1' && b.charAt(i) == '0' && carry == '0') {
				result.append(1);
			} else if (a.charAt(i) == '1' && b.charAt(i) == '0' && carry == '1') {
				result.append(0);
				carry = '1';
			} else if (a.charAt(i) == '0' && b.charAt(i) == '1' && carry == '1') {
				result.append(0);
				carry = '1';
			} else if (a.charAt(i) == '0' && b.charAt(i) == '0' && carry == '1') {
				result.append(1);
				carry = '0';
			} else if (a.charAt(i) == '0' && b.charAt(i) == '0' && carry == '0') {
				result.append(0);
				carry = '0';

			}
		}

		if (carry == '1') {
			result.append(1);
		}

		return result.reverse().toString();

	}
	
	
	public static String addBinary(String a, String b) {
		int i=a.length()-1 , j=b.length()-1;
	    int carry = 0;
	    StringBuilder sb = new StringBuilder();
	    while(i>=0 || j>=0){
	        int sum=carry;
	       if(i>=0){
	            sum+=a.charAt(i--)-'0';
	        }
	        if(j>=0){
	            sum+=b.charAt(j--)-'0';
	        }
	         
	        sb.append(sum%2);
	        carry = sum/2;
	    }
	    
	    if(carry!=0){
	        sb.append(carry);
	    }
	    return sb.reverse().toString();
	    
	    
	    
	}
	
	
	
	


}
