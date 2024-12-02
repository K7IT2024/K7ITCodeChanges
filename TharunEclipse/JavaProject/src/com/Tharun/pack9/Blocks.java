package com.Tharun.pack9;

public class Blocks {
	
	static int X;
	int x;
	
	{
		X = 10;
		System.out.println("INSATANCE INISILIZATION BLOCKS EXCuted.X="+X); 
	}
	
	
	static{
		X = 10;
		System.out.println("Static INISILIZATION BLOCKS EXCuted.X="+X); 
	}
	
	Blocks(){
		System.out.println("constructor called");
	}
	
	
	public static void main(String[] args) {
		Blocks b1 = new Blocks();
		
		Blocks b2 = new Blocks ();
	}

}
