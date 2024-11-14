package com.K7it.pack1;



public class Attributes {

			
		int age;
		String name;
		double height;
		double weight;
		
	    static int legs;
		static String foodtype;
	    
	    
	    
			
			double getRunRate() {
				return (height*weight)/age;
		}
		
		
public static void main (String args[]) {
	
	Attributes a1 = new Attributes ();
	
	constructor c = new constructor();

	
	
	
	a1.age = 30;
	a1.name = "tharun";
	a1.height = 6.0;
	a1.weight = 90;
	
	a1.foodtype = "rice";
	a1.legs=2;
	
	double tharunRunRate= a1.getRunRate();
	
	
	System.out.println("RunRate:"+tharunRunRate);
	
	
	System.out.println(a1.age);
	System.out.println(a1.name);
	System.out.println(a1.height);
	System.out.println(a1.weight);
	
	System.out.println(a1.foodtype);
	System.out.println(a1.legs);
	
	
	Attributes a2 = new Attributes();
	
//double thaRunRate= a2.getRunRate();
	
	
	//System.out.println("RunRate:"+thaRunRate);
	
	a2.age = 3;
	a2.name = "tha";
	a2.height = 6.0;
	a2.weight = 900;
	
	a2.foodtype="grass";
	a2.legs=4;
	
	double thaRunRate= a2.getRunRate();
	
	System.out.println("RunRate:"+thaRunRate);
	
	System.out.println(a2.age);
	System.out.println(a2.name);
	System.out.println(a2.height);
	System.out.println(a2.weight);
	
	System.out.println(a2.foodtype);
	System.out.println(a2.legs);
	
	
Attributes a3 = new Attributes();
	
	
	a3.age = 3;
	a3.name = "tha";
	a3.height = 6.0;
	a3.weight = 900;
	a3.foodtype=null;
	a3.legs=5;
	
	System.out.println(a3.age);
	System.out.println(a3.name);
	System.out.println(a3.height);
	System.out.println(a3.weight);
	System.out.println(a3.foodtype);
	System.out.println(a3.legs);
	
}
		
	}


