package com.sugi.test2;

public class ReverseNumberUsingStringBuffer {
	
	
	public static void main(String[] args) {
		
		
		int num =1234;
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(num);
		
		System.out.println(buffer.reverse());
		
		
		StringBuilder bulder = new StringBuilder(String.valueOf(num));
		
		System.out.println("builder "+bulder.reverse());
		
		
		
	}

}
