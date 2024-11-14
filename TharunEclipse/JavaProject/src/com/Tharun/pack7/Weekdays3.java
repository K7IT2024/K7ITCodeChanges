package com.Tharun.pack7;

public enum Weekdays3 {
	
	SUNDAY(),MONDAY(),TUESDAY(),WEDNESDAY(),THURSDAY(),FRIDAY(),SATURDAY();


	Weekdays3(){
		System.out.println("weekdays ");
		}
	
	
	Weekdays3(int i){
		System.out.println("weekdays ");
		}
	
	{
	System.out.println("IIb");
	}
		
	static{
		System.out.println("sIb1");
	}
	
	public static void main (String args[]) {
			Weekdays1 w7= Weekdays1.MONDAY;
		System.out.println(w7);
	}

}