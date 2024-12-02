package com.Tharun.pack9;

public class Methods {

	int add(int i ,int j) {
		return i+j;
		
	}
	
	int mul() {
		return 0;
		
		}
	
	double mul(double d1,double d2) {
		return d1*d2;
	}
	
	void m1() {
		System.out.println("m1");
	}
	
	
	public static void main(String[] args) {
		
		Methods m1 = new Methods();
		
		m1.m1();
		System.out.println(m1.add(20,30));		
		System.out.println(m1.mul(10,30));
		System.out.println(m1.mul());
	}
	
}
