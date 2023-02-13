package com.sugi.algotest;

import java.util.Arrays;

public class StackImplementation<T> {

	private static final int initialCapacity = 4;

	private T[] arr;

	private int top;
	
	private int capacity;

	@SuppressWarnings("unchecked")
	public StackImplementation() {
		arr = (T[]) new Object[initialCapacity];
		capacity = initialCapacity;
		top = 0;

	}

	public void push(T value) {
		
		if(capacity == top)
		{
			expandArray();
		}
		if (top == 0) {
			arr[0] = value;
			top++;
		} else {
			arr[top++] = value;
		}
	}

	public void display() {
		
		if(top==0)
		{
			System.out.println("Stack Empty");
		}
		
		for(int i=0;i<top;i++)
		{
			System.out.print(arr[i]+" ");
		} 
	}
	
	
	public T pop()
	{
		if(top==0)
		{
			throw new IndexOutOfBoundsException("Stack Empty");
		}
		return arr[--top];
	}
	
	
	private void expandArray()
	{
		capacity = initialCapacity * 2;
		arr = Arrays.copyOf(arr, capacity);
	}
}
