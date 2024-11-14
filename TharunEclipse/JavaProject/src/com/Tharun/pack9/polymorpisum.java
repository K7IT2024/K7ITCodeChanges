package com.Tharun.pack9;

public class polymorpisum {
	
	int add(int a ,int b) {
		return a+b;
		
	}
	
	int add (int a ,int b ,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		polymorpisum p = new polymorpisum();
		
		System.out.println(p.add(20, 50));
		
		System.out.println(p.add(20, 50,70));
	}
	
	

}
