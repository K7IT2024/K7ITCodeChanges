package com.Tharun.pack9;

class Child1 {

	int age;
	String name;

	void m1() {
		System.out.println("m1");
	}

	int add(int i, int j) {
		return i + j;
	}

}

class Child extends Child1 {

	public static void main(String[] args) {

		Child c1 = new Child();

		c1.m1();

		System.out.println(c1.add(1, 2));

	}

}
