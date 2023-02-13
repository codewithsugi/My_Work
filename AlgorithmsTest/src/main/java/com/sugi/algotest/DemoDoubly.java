package com.sugi.algotest;

public class DemoDoubly {
	
	public static void main(String[] args) {
		
		DoublyLinkedList demo = new DoublyLinkedList();
		demo.insertAtBegining(1);
		demo.insertAtBegining(2);
		demo.insertAtBegining(3);
		demo.insertAtBegining(4);
		demo.insertAtBegining(5);
		demo.insertAtBegining(6);
		demo.insertAtBegining(7);
		demo.insertAtBegining(8);
		
		
		demo.display();
		
		System.out.println();
		
		demo.displayResverse();
		
		
		demo.insertAtPosition(8, 10);
		demo.insertAtPosition(9, 9);
		demo.insertAtPosition(10, 11);
		demo.insertAtPosition(11, 12);
		demo.insertAtPosition(12, 13);
		demo.insertAtPosition(13, 14);
		
		
		System.out.println();
		
		demo.display();
	}

}
