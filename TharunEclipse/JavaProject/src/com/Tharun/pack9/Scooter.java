package com.Tharun.pack9;


 interface X1 {

	void fixBreaks();
	void fixEngine();
	void fixTyres();
	void fixBody();
	
}


abstract class Cycle implements X1{
	public void fixBreaks() {
		System.out.println("fixcycle breaks");
	}
	
	public void fixEngine() {
		System.out.println("fixcycle breaks");
	}
	
	public void fixTyres() {
		System.out.println("fixcycle breaks");
	}
	
}

abstract class GearCycle extends  Cycle{
	
}
	
public 	class Scooter extends  GearCycle {
		
		public void fixBody() {
			System.out.println("body fixed scottere class ");
			
		}
		public static void main(String[] args) {
			
			Scooter s1 = new Scooter();
			s1.fixBody();
			s1.fixBreaks();
			s1.fixTyres();
			s1.fixEngine();
		}
	}
