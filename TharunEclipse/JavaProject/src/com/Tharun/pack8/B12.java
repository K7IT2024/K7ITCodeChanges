package com.Tharun.pack8;

public interface X {

	void m1();
	
}

class A {

	
}

class B12 extends A implements X{

	public void m1() {
		System.out.println("m1 implements here" );
	}
	
	public static void main(String[] args) {
		
	
	
	B12 b1 = new B12();
	
	b1.m1();
	
	}
}