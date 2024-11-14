package com.Babu;

public class Red {
	int age;
	String name;
	String colour;
	int legs;
	Red(){
		System.out.println("no arg constructor");
	}
	Red(int age,String name){
		this();
		this.age=age;
		this.name=name;
		Red R3=new Red();
		R3.age=36;
		R3.colour="Black";
		System.out.println(R3.age);
		System.out.println(R3.colour);
		
	}
	public static void main(String[] args) {
		Red r2=new Red();
		Red R1=new Red(17,"babu");
		System.out.println(R1.age);
		System.out.println(R1.name);
		System.out.println(r2.name);
		System.out.println(r2.age);
	}

}
