package com.Babu;

public enum WeekDays {
	SUNDAY,MONDAY("Babu"),TUESDAY,WEDNESDAY(453),THURSDAY,FRIDAY(564265),SATURDAY;
	
	WeekDays(){
		System.out.println("Enum no-arg constructor");
	}

	WeekDays(int i){ 
		System.out.println("Weekday:"+i);
		
	}
	
	{
		System.out.println("IIB  ");
	}
	static {
		System.out.println("SIB");
	}
	WeekDays(String s){
		System.out.println("String type constructor");
	}
	
	public static void main(String[] args) {
		WeekDays w=WeekDays.MONDAY;
		System.out.println(w);
		WeekDays w1=WeekDays.TUESDAY;
		System.out.println(w1);
		WeekDays w2=WeekDays.WEDNESDAY;
		System.out.println(w2);
	}

}
