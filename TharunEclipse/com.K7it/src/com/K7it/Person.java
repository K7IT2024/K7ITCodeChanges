package com.K7it;

abstract public class Person {

	int age;
	String name;
	double height;
	double weight;
	
	public void Tharun(int age, String name, double height, double weight) {
		
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void m9() {
		System.out.println("not implement");
	}
	
	

	void m1() {

		System.out.println("Person-m1");

	}

	void m2() {

		System.out.println("person-m2");

	}

	void m3() {

		System.out.println("person-m3");
	}

}

class Tharun extends Person{
	
	int age;
	String name;
	double height;
	double weight;
	
	public Tharun(int age, String name, double height, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	public Tharun() {
		// TODO Auto-generated constructor stub
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	void m1() {
		System.out.println("Tharun-m1");
	}
	
	void m2() {
		
		System.out.println("tharun-m2");
	}
	void m3() {
		System.out.println("tharun-m3");
	}
	
	public void m9() {
		System.out.println("implement");
		
	}
	
	

	public static void main(String[] args) {
	
		//Person p1 = new Person();
		
		//p1.m1();
		
//		Tharun t1 = new Tharun(9,"tharun",6.0,56.00);
//		t1.m1();
//		t1.m2();
//		t1.m3();
//		t1.m9();
//		
//		
//		System.out.println(t1.age);
//		System.out.println(t1.name);
//		System.out.println(t1.height);
//		System.out.println(t1.weight);
		
		Person a1 = new Tharun();
		a1.m1();
		a1.m2();
		a1.m3();
		
		
		}

	
		}