package com.Tharun.pack4;

 class Abc {
     int age =10;
     String name="arya";
	
	void m1() {
		System.out.println("1");
	}
     
	void m2() {
		System.out.println("2");
	}
}
	class Bc extends Abc{
	int age = 20;
	
	void m1() {
	System.out.println("3");	
	}
	
	void m2() {
		System.out.println("4");
	}
	
	
	public static void main(String[] args) {
		
	
	Abc a1 = new Bc();
	a1.m1();
	a1.m2();
	
	
	Bc b1 = new Bc();
	
	b1.m1();
	b1.m2();
	}
	}