package com.Babu;

final public class Z {
	int i=11;
	String name="Babu";
	Z(){
		System.out.println("B-noarg");
	}
	Z(int i,String name){
		this.i=i;
		this.name=name;
		
	}
	int add() {
		return 10;
	}
	
	
	long mul() {
		return 308767667*2;
	}
	
	public static void main(String[] args) {
		Z z1=new Z();
		z1.add();
		System.out.println(z1.add());
		System.out.println(z1.i);
		System.out.println(z1.name); 
		
	      Z z4 = new Z(32,"theeta"); 
	      z1.add();
			System.out.println(z4.add());
			System.out.println(z4.i);
			System.out.println(z4.name); 
			System.out.println(z4.mul());
	      
	}

}

