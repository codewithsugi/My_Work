package com.test.sugi;

public class SubClass extends BaseClass {
	
	
	@Override
	void display() {
		System.out.println("Cool.. I am sub class");
	}

	public static void main(String[] args) {
		
		 BaseClass b = new SubClass();
		 
		 b.display();
		 
		 SubClass c = (SubClass) b;
		 
		 c.disp();

	}
	
	
	void disp()
	{
		System.out.println("Im inst meth");
	}

}
