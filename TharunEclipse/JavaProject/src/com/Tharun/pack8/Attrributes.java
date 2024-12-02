package com.Tharun.pack8;

public class Attrributes {
	
	int age;
	String name;
	double height;
	double weight;
	
	 double getRunRate() {
		return (height*weight)/age;
	}

	
	
	


	public static void main(String[] args) {
		
		Attrributes a1 = new Attrributes();
		a1.age =10;
		a1.name="tharun";
		a1.height=5.0;
		a1.weight=89;
		
	double 	tharunRunRate= a1.getRunRate();
		
	
	
	System.out.println(tharunRunRate);
		System.out.println(a1.age);
		System.out.println(a1.name);
		System.out.println(a1.height);
		System.out.println(a1.weight);
	}
	

}
