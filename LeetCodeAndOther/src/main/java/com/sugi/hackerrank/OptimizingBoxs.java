package com.sugi.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class OptimizingBoxs {

	public static void main(String[] args) {
	
		List<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(3);
		arr.add(2);
		arr.add(4);
		arr.add(1);
		arr.add(2);
		System.out.println(minimalWeight(arr));

	}
	
	
	public static List<Integer> minimalWeight(List<Integer> arr)
	{ 
		Collections.sort(arr);  
		
		List<Integer> startList = new ArrayList<>();
        List<Integer> endList = new ArrayList<>();
        List<Integer> mergeList = new ArrayList<>();
        
        int mid;
        int startSum = 0;
        int endSum = 0;
        
        for(int i=0;i<arr.size();i++)
        {
             mid = (arr.size()/2)+1;
             
             if(i<mid)
             {
                startList.add(arr.get(i)); 
             }
             else{
                endList.add(arr.get(i));
             }
        }
        //System.out.println(startList);
       // System.out.println(endList);
        
        mergeList.addAll(startList);
        mergeList.addAll(endList);
        
        if(mergeList.containsAll(arr))
        {
        	if(endList.size() < startList.size())
        	{
        		
        		for(int i=0;i<startList.size();i++)
        		{
        			startSum +=startList.get(i);
        		}
        		for(int i=0;i<endList.size();i++)
        		{
        			endSum +=endList.get(i);
        		}
        		
        		if(endSum>startSum)
        		{
        			return endList;
        		}

        	}
        }
        
     

		return null;

}
}
