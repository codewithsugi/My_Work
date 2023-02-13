package com.sugi.algotest;

public class DoublyLinkedList {

	class Node {

		int data;
		Node prevNode;
		Node nextNode;

		Node(int data) {
			this.data = data;
			prevNode = null;
 			nextNode = null;

		}

	}

	Node head;
	Node tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;

	}

	public void insertAtBegining(int val) {
		Node newNode = new Node(val);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			head.prevNode = newNode;
			newNode.nextNode = head;
			head = newNode;
		}
	}

	public void insertAtPosition(int position, int value) {
		Node newNode = new Node(value);
		Node temp = head;

		if (position == 0) {
			insertAtBegining(value);
		} else {

			for (int i = 0; i < position - 1; i++) {
				temp = temp.nextNode;
			}

			newNode.nextNode = temp.nextNode;
			newNode.prevNode = temp;
			if (temp == tail) {
				tail = newNode;
			} else {
				temp.nextNode.prevNode = newNode;
			}
			temp.nextNode = newNode;
		}

	}

	public void display() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.nextNode;

		}

	}

	public void displayResverse() {

		Node temp = tail;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prevNode;

		}

	}

}
