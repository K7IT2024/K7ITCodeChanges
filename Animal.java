package com.actualjava;

public class Animal {
	String name;
	
	Animal(String name){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + "]"; 
	}
	

	public static void main(String[] args) {
		Animal animal=new Animal("kumar is my friend");
		System.out.println(animal);
		String s1=new String("hello this is babureddy");
		
		System.out.println(s1);
		System.out.println(s1.indexOf("s"));
		System.out.println(s1.lastIndexOf("s"));
		System.out.println(s1.indexOf("s")==s1.lastIndexOf("s"));
		System.out.println(s1.charAt(15));
		System.out.println(s1.chars());
		System.out.println(s1.replace("th", "that"));
		
	}

}
