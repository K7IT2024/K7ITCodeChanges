package com.Tharun.pack5;

public class P {
	P(){
	
		}
    int i=20;
	 int j=90;
	
	P(int i,int j){
		this.i=i;
		this.j=j;
	}
		
	void m1() {
		
		System.out.println("no-arg");
	}
	
	public static void main(String[] args) {
		P p1 = new P (90,90);
		
		System.out.println(p1.i);
		System.out.println(p1.j);
		
		
		P p2=new P(9, 9);
		System.out.println(p2.i);
		System.out.println(p2.j);
		
		P p3 = new P();
		
		System.out.println(p3.i);
		System.out.println(p3.j);
		
		
		p3.m1();
		
	}
	
}
