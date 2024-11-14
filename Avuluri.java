package com.Babu;

public final class Avuluri implements Interface{
	static {
		System.out.println("Avuluri babureddy");
	}
	{
		System.out.println("he is a farmer");
	}
	public void m1() {
	 Avuluri a1=new Avuluri();
	 Avuluri.m3();
	System.out.println("is it true bhavani"); 
	}
	public void m2() {
	m1();	
	}
	static void m3() {
		System.out.println("musukoni kurchora poolachokka");
	}
	public void m4() {
		System.out.println("velli adukku tinu yadava");
		m2();
	}
	public static void main(String[] args) {
		Avuluri a2=new Avuluri();
		a2.m1();
		a2.m2();
		a2.m4();
		Avuluri.m3(); 
	}
	
	

}
