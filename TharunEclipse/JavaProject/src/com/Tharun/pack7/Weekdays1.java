package com.Tharun.pack7;

public enum Weekdays1 {

	SUNDAY(88), MONDAY(786), TUESDAY(88), WENSDAY(675), THURSDAY(), FRIDAY(897), SATURDAY(77);

	
	static {
		System.out.println("sattic iibs");
	}

	
	
	Weekdays1(int i) {
		System.out.println("int type constructor");
	}

	Weekdays1() {
		System.out.println("no-arg");
	}

	{

		System.out.println("IIB 0");
	}
	
	
	
	public static void main(String[] args) {

		Weekdays1 w = Weekdays1.SUNDAY;
		System.out.println(w);
	

	  Weekdays1 w1 =  Weekdays1.FRIDAY;
			  
	  System.out.println(w1);
	
	
}

	
	
}
