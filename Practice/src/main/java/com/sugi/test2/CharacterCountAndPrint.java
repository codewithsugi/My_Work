package com.sugi.test2;

public class CharacterCountAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aaaaabbbcdddd";
		
		char[] inputArray = input.toCharArray();
		int counter = 1;
		StringBuffer buff = new StringBuffer();
		int start =0;
		for(int i=0;i<inputArray.length-1;i++)
		{
			start++;
			if(inputArray[i] == inputArray[i+1])
			{
				counter++;
			}
			else
			{
				buff.append(counter).append(inputArray[i]);
				counter=1;
			}
			
		}
		
		buff.append(counter).append(inputArray[start]);
		System.out.println(buff);

	}

}
