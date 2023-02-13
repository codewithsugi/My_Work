package com.sugi.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	// following code will execute or not check
	
	private Map<String,Integer> map;
	
	
	MapTest()
	{
		
		map = new HashMap();
		
		map.put("foo", 1);
		map.put("bar", 2);
		
	}
	
	
	public int getValue(String input, int numRet) throws Exception
	{
		try {
			return map.get(input).intValue();
		}
		catch(Exception e)
		{
			if(numRet > 3)
			{
				throw e;
			}
		}
		return getValue(input,numRet+1);
		
	}
	
	public static void main(String[] args) throws Exception {
		
			System.out.println(new MapTest().getValue("test", 1));
		
	}

}
