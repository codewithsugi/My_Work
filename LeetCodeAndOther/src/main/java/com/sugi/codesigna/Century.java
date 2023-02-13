package com.sugi.codesigna;

public class Century {
	
	public static void main(String[] args) {
		System.out.println(solution(1905));
		
		
		
		
		
		float number = 30.0f;
        float parts = 4.0f;    

        float val = number / parts;

        val = Math.round(val);
        if (val * parts == number){
            System.out.println("Numbers are:");
            for (int i = 0; i < parts; i++)
                System.out.println(val);
        }
        else {
            int diff = Math.round((val * parts) - number);
            System.out.println("Numbers are:");
            for(int i = 0;i < parts - 1; i++)
                System.out.println(val);
            System.out.println(val - diff);
        }
		
	}
	
	
	static int solution(int year) {
	    
	    double century = (double) year/100;
	    
	    System.out.println(century);
	    
	    return  (int) (Math.ceil(century));

	}

}
