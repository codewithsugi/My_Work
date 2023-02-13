package com.sugi.algotest;

public class CircularLinkedList {

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}
	
	Node last;
	
	public CircularLinkedList() {
		last =null;
	}
	
	public void insertAtBegining(int value)
	{
		Node newNode= new Node(value);
		if(last == null)
		{
			newNode.next=newNode;
			last = newNode;
		}
		else
		{
			newNode.next = last.next;
			last.next = newNode;		
		}
	}
	

	public void insertAtEnd(int value)
	{
		Node newNode= new Node(value);
		if(last == null)
		{
			newNode.next=newNode;
			last = newNode;
		}
		else
		{
			newNode.next = last.next;
			last.next = newNode;	
			last=newNode;
		}
	}
	
	
	
	public void display()
	{
		if(last == null)
		{
			System.out.print("List is Empty");
			return;
		}
		
		Node temp = last.next;
		
		do
		{
			System.out.print(temp.data+ " ");
			temp=temp.next;
			
		}while(temp != last.next);
		
		
	}
	
	
	public void deleteAtBegining()
	{
		if(last == null)
		{
			throw new IndexOutOfBoundsException("List Empty");
		}
		else if(last.next==last)
		{
			last=null;
			return;
		}
		else
			last.next=last.next.next;
	}
	
	
	public void deleteAtEnd()
	{
		if(last == null)
		{
			throw new IndexOutOfBoundsException("List Empty");
		}
		else if(last.next==last)
		{
			last=null;
			return;
		}
		else
		{
			Node temp = last.next;
			
			while(temp.next != last)
			{
				temp = temp.next;
			}
			
			temp.next =  last.next;
			last=temp;
		}
			

	}
	
}