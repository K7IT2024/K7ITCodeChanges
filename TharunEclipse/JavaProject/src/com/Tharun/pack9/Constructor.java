package com.Tharun.pack9;

public class Constructor {

	Constructor(){
		System.out.println("no arg constructor ");
	}
	
	Constructor (int i){
		System.out.println("int type constructor");
	}
	
	Constructor (double d1 ,double d2){
		System.out.println("double type constructor");
	}
	
	Constructor (double d1 ){
		System.out.println("double type constructor");
	}
	
	
	Constructor (String s1 ){
		System.out.println("Str type constructor");
	}
	
	
	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor();
		Constructor c3 = new Constructor();
		
		Constructor c5 = new Constructor(10);
		Constructor c6 = new Constructor(10.0,20.0);
		Constructor c7 = new Constructor(10.0);
		
		Constructor c8 = new Constructor("Tharun");
	}
}
