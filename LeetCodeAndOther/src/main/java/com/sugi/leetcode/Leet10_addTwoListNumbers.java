package com.sugi.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leet10_addTwoListNumbers {
	
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(6);
		l2.add(4);
		
		
		System.out.println(addTwoNumbers(l1,l2));
	}
	
	 public static List addTwoNumbers(List<Integer> l1, List<Integer> l2) {
	        
		 int addValue;
		 String sum = "";
		 int quotient=0;
         int reminder;
         List a = new ArrayList<>();
	        for(int i=0 ;i<=l1.size() - 1;i++)
	        {
	            addValue = l1.get(i) +l2.get(i);
	            if(quotient != 0)
            	{
            		addValue = addValue+quotient;
            	}
	            	
	            if(addValue > 9)
	            {
	            	reminder = addValue %10;
	            	quotient = addValue /10;
	            	
	            	sum=sum+String.valueOf(reminder);
	            	
	            }
	            else
	            {
	            	sum = sum + String.valueOf(addValue);
	            }
	            
	            a.add(sum);
	        }
			return a;
	        
	    }

}
