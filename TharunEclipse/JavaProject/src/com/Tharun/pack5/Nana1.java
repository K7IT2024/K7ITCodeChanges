package com.Tharun.pack5;

  class Nana {
	
	
	int age= 10;
	String name = "mom";
	
	
	int add (int i,int j) {
		return i+j;
		
	}
  
	void m1() {
		System.out.println("m1");
	}
	
}
	class Nana1 extends Nana{
		
		int age= 60;
		String name = "dad";
		
		public static void main(String[] args) {
			Nana1 n1 = new Nana1();
			n1.m1();
			
			
	System.out.println(n1.add(9, 9));
	System.out.println(n1.age);		
	System.out.println(n1.name);		
	System.out.println(n1.age);		
	System.out.println(n1.name);

	
	Nana n = new Nana();
	System.out.println(n.age);		
	System.out.println(n.name);
	
		}
		
	}
	
	

