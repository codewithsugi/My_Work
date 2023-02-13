package com.sugi.algotest;

import java.util.Iterator;

public class DemoLinked {
	
	public static void main(String[] args) {
		
		
		LinkedList<Float> demo = new LinkedList<Float>();
		demo.insertAtBegining(10.3f);
		demo.insertAtBegining(5.2f);
		
		demo.insertAtBegining(7.89f);
		
		//demo.display();
		
		demo.insertAtIndex(2, 4.87f);
		
		demo.insertAtIndex(4, 8.33f);
		
		demo.insertAtIndex(5, 14.0f);
		
		System.out.println("before delete");
		
		demo.display();
		
		demo.deleteAtBegining();
		
		System.out.println("\nAftr delete");
		
		demo.display();
		
		demo.deleteAtPosition(4);
		
		System.out.println("\nAftr delete at position");
		
		demo.display();
		
		demo.deleteAtEnd();
		
		System.out.println("\nAftr delete at end");
		
		demo.display();
		
		Iterator it = demo.iterator();
		System.out.println();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
