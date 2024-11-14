package com.Tharun.pack4;


public class T {

	int age;
	String name;
	double height;
	double weight;
	
	void m1(){
	
	System.out.println("kopam");
	}
	
	void m2() {
		System.out.println("santhym1");
	}
	
	public static void main(String[] args) {
		
		
		T t1 = new T();
		
		t1.m1();
		t1.m2();
		
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.height);
		System.out.println(t1.weight);
	}
	
}


