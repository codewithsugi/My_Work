package com.sugi.algotest;

public class NodeAsInnerClass {
	
	
	
	
	private static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
			
		}
	}
	
	
	
	
	Node head = new Node(2);

}
