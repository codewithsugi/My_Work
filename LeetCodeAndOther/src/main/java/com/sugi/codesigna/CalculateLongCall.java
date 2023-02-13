package com.sugi.codesigna;

public class CalculateLongCall {
	
	public static void main(String[] args) {
		
		System.out.println(solution(3,1,2, 20));
		
	}
	    
		static int solution(int min1, int min2_10, int min11, int s) {
		    
		    int total;
		    int call;
		     if(min1 == s)
		     {
		         return 1;
		     }
		     else if( min1*1 > s)  	 
		     {
		    	 return 0;
		     }
		     else if( ((min1 * 1) + (min2_10 * 9)) >= s)
		     {
		          total = s - (min1 *1) ;
		          call = total / min2_10 ;
		          return call+1;
		     }
		     else
		     {
		         total = s - (min1 *1) ;
		         total = total - (min2_10 * 9);
		         call = total / min11 ;
		         return call+10;
		         
		     }
		}

       
        
}
