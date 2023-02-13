package com.sugi.algotest;

public class DemoCircularLinkedList {
	
	public static void main(String[] args) {
		
		
		CircularLinkedList cl = new CircularLinkedList();
		
		cl.insertAtBegining(1);
		
		cl.display();
		
		cl.insertAtBegining(2);
		
		System.out.println();
		cl.deleteAtBegining();
		
		cl.display();
		
		
	}

}
