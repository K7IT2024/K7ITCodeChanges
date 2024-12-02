package com.K7it.partices.pack3;

public class E {
	
		
	

	public void m1() {	
	System.out.println("E class m1");	
	m2();
	  }

	public void m2() {
		
		System.out.println(" E class m2");
		
	}
	
	public int add(int i,int j) {
		
		return i+j;
	}
	
	public double mul(double d1,double d2) {
		
		return d1*d2;
		
	}
	
	public static void main(String[] args) {
		
		E e1 = new E();
		e1.m1();
		e1.m2();
		
		System.out.println(e1.add(20,30));
		System.out.println(e1.mul(10,10));
		
		P p1 = new P();
		
		System.out.println(p1.age);
	System.out.println(p1.name);
		System.out.println(p1.height);
	System.out.println(p1.weight);
		
		
		
		
	}
	
}