package com.Tharun.pack7;

public enum Weekdays4 {

	SUNDAY(),MONDAY(),TUESDAY(),WEDNESDAY(),THURSDAY(),FRIDAY(),SATURDAY();
	
	Weekdays4(){
		System.out.println("weekadays no args");
	}
	
	
	{
		System.out.println("iib");
	}
	
	static {
		System.out.println("static Sib");
	}
	
	public static void main(String[] args) {
		
		Weekdays4 w6 = Weekdays4.SUNDAY;
		System.out.println(w6);
		
		Weekdays4 w7 = Weekdays4.MONDAY;
		System.out.println(w7);
		
	}
	
	
}
