package com.K7it.pack1;

public class Interface {
	
  int age;
	String name;
	
	
	
	
	public Interface(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

  


	public static void main(String args[]) {
		
		Interface i = new Interface(9,"sai");
		
		
		
		System.out.println(i.age);

		System.out.println(i.name);
	}
  

}
