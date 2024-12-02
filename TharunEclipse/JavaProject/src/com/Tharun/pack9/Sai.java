package com.Tharun.pack9;

  abstract class Tharun {

  
	
	public void m1() {
		System.out.println("m1");
	}
	
  }
  
  interface X{
	  void m1();
  }
class Sai extends Tharun implements X{
	public void m1() {
		System.out.println("M1");
	}
	
	public static void main(String[] args) {
		
		Sai s1 = new Sai();
		s1.m1();
		
	}
}