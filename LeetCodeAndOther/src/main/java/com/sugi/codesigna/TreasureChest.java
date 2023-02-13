package com.sugi.codesigna;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TreasureChest {

	public static void main(String[] args) {
		System.out.println(solution(10,2, 11, 3, 1));
		
		
		HashSet<Integer> set = new HashSet<>();
		
		LinkedHashSet<Integer> se1 = new LinkedHashSet<>();
		
		LinkedList a = new LinkedList<>();
		System.out.println(false && false);
		
		
	}

	static int solution(int value1, int weight1, int value2, int weight2, int maxW) {
	    
	    if(weight1+weight2 == maxW)
	    {
	        return value1+value2;
	    }
	    else 
	    {
	        if(value1 > value2)
	        {
	            return value1;
	        }
	        else
	        {
	            return value2;
	        }
	        
	    }

	}
}
