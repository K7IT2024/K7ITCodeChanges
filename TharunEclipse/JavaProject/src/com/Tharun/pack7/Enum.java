package com.Tharun.pack7;

public enum Enum {
	JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),
	 SEP(30),OCT(31),NOV(30),DEC(31);

	Enum(int i) {
		
		System.out.println("No of days in "+this+":"+i);
	}
		
	}


