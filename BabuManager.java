package com.actualjava;

public class BabuManager {
	public static void main(String[] args) {
		Babu b1=new Babu(27,"Babureddy",5.6,70.25);
		System.out.println(b1);
		b1=new Babu(26,"Reddy",6.7,76.78);
		System.out.println(b1);
		Babu b2=new Babu(26,"Reddy",6.7,76.78);
		System.out.println(b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.hashCode()==b2.hashCode());
	}

}
