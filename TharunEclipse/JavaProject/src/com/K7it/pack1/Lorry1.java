package com.K7it.pack1;


	public class Lorry1 implements Vehical1{
		
		public void fixEngine() {
			
			System.out.println("fixed Lorry Engine");
			
		}
		
		
	public void fixBreaks() {
			
			System.out.println("fixed Lorry breaks");
			
		}
	public void fixBody() {
		
		System.out.println("fixed Lorry Body");
		
	}

	public void fixTyres() {
		
		System.out.println("fixed Lorry Tyres");
		
	}
	public static void main(String[] args) {
		
		Lorry1 l1 = new Lorry1 ();
		l1.fixBody();
		l1.fixBreaks();
		l1.fixEngine();
		l1.fixTyres();
		
		
	}

}

	
	

