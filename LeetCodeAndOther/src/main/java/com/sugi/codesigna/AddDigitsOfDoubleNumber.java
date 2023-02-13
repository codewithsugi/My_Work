package com.sugi.codesigna;

public class AddDigitsOfDoubleNumber {

	public static void main(String[] args) {
		System.out.println(solution(808));
	}

	static int solution(int n) {
		int temp = 0;
		int sec = n%60;
		int min = (n-sec)/60;
		
		while(sec>0)
		{
			temp = temp+(sec%10);
			sec = sec/10;
		}
		while(min>0)
		{
			temp = temp+(min%10);
			min = min/10;
		}
		return temp;

	}
}
