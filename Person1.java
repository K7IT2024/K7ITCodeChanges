package com.scanner;

public final class Person1 {
	private int age;
	private String name;
	private double ht;
	private double wt;
	
	public Person1(int age,String name,double ht,double wt) {
		this.age=age;
		this.name=name;
		this.ht=ht;
		this.wt=wt;
		
	}

	@Override
	public String toString() {
		return "Person1 [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
	}

	}


