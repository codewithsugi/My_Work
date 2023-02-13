package com.sugi.algotest;

public class StackDemo {
	
	
	public static void main(String[] args) {
		
		
		StackImplementation stack = new StackImplementation();
		
		
		stack.push(10);
		
		stack.push(11);
		
		stack.push(12);
		
		stack.push(13);
		
		stack.push(14);
		
		stack.display();
		
		System.out.println();
		
		stack.pop();
		
		stack.pop();
		
		stack.pop();
		
		stack.pop();
		
		stack.pop();
		
		stack.display();
		            
		
	}

}
