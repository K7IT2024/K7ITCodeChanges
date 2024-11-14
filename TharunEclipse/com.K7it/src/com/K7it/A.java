package com.K7it;

public class A {
	
	A(){
		
	System.out.println("A no arg conmstructor");	
	}
	
	A(int i){
		
		System.out.println("A int type constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		
		A a1 = new A();
		
		A a2 = new A(10);
		
		A a3 = new A();
		
	}
	
	
	
	
	
}