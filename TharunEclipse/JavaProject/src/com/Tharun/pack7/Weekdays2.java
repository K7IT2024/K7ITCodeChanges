package com.Tharun.pack7;

public enum Weekdays2 {

	SUNDAY(1),MONDAY("tharun"),TUESDAY(),WEDNESDAY(),THURSDAY(),FRIDAY(),SATURDAY();
	
	
	Weekdays2(int i){
		System.out.println("int type constuctor");
	}
	

	Weekdays2(String  s){
		System.out.println("string type constuctor");
	}
	
	
	
	Weekdays2(){
		System.out.println("args");
	}
	
	{
		System.out.println("iib");
	}
	
	public static void main(String[] args) {
		Weekdays2 w3 = Weekdays2.MONDAY;
		System.out.println(w3);
		
		Weekdays2 w4 = Weekdays2.TUESDAY;
		System.out.println(w4);
	}
}
