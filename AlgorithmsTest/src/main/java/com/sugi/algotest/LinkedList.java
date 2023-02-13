package com.sugi.algotest;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

	class Node {

		T data;
		Node nextNodeAddr;

		Node(T data) {
			this.data = data;
			nextNodeAddr = null;
		}
	}

	Node head;

	LinkedList() {
		head = null;
	}

	public void insertAtBegining(T data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;

		} else {
			newNode.nextNodeAddr = head;
			head = newNode;
		}
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.nextNodeAddr;
		}

	}

	public void insertAtIndex(int index, T data) {

		Node newNode = new Node(data);
		Node temp;

		if (index == 0) {
			insertAtBegining(data);
			return;
		} else {
			temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.nextNodeAddr;
				if (temp == null) {
					throw new ArithmeticException("Invalid Postion since list having only " + i + 1 + " values");
				}

			}

			newNode.nextNodeAddr = temp.nextNodeAddr;
			temp.nextNodeAddr = newNode;

		}

	}

	public void deleteAtBegining() {
		Node temp = head;

		temp = temp.nextNodeAddr;

		head = temp;
	}

	public void deleteAtPosition(int pos) {
		Node temp = head;
		Node prev = null;

		for (int i = 0; i <= pos - 1; i++) {
			prev = temp;
			temp = temp.nextNodeAddr;
		}

		if (temp == null) {
			prev.nextNodeAddr = null;
			return;

		} else
			prev.nextNodeAddr = temp.nextNodeAddr;

	}

	public void deleteAtEnd() {
		Node temp = head;
		Node prev = null;

		while (temp.nextNodeAddr != null) {
			prev=temp;
			temp = temp.nextNodeAddr;
		}

		prev.nextNodeAddr = null;

	}

	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
			
			Node temp = head;

			public boolean hasNext() { 
				return temp != null;
			}

			public T next() {
				T val = temp.data;
				temp = temp.nextNodeAddr;
				return val ;
			} 
			
			
			
		};
	}

}
