package com.sugi.codesigna;

public class SumOf2DigitNumber {
	
	public static void main(String[] args) {
		
		
		System.out.println(solution(29));
	}
	
	
	static int solution(int n) {
	    
        int temp =0;
        int num;
        while(n>0)
        {
            temp = temp+n%10;
            n=n/10;
        }

    return temp;
}

	
	
	

}
