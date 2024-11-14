package com.Babu;

public class Over extends Box implements Babureddy {
	int age=26;
	String name="Reddy";
	
	int add() {
		System.out.println("add method");
		return age;
	}
	String Voice() {
		System.out.println("printing name");
		return name;
	}

	public static void main(String[] args) {
		Over o=new Over();
		o.m1();
		o.m2();
		o.m3();
		System.out.println(o.add());
		System.out.println(o.Voice());
		System.out.println(Babureddy.age);
		System.out.println(Babureddy.name);
	}
}
