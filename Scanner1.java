package com.scanner;

import java.util.Scanner;

 class Scanner1 {
	 int age;
	 String name;
	 String colour;
	public static void main(String[] args) {
		Scanner1 sa= new Scanner1();
		sa.age=28;
		sa.name="kumar";
		sa.colour="black";
		boolean flag=false;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name");
		String name=sc.nextLine();
		System.out.println("please enter your age");
		int age=sc.nextInt();
		System.out.println("please enter your ht");
		double ht=sc.nextDouble();
		System.out.println("please enter your wt");
		double wt=sc.nextDouble();
		System.out.println();
		Person p1=new Person(name,age,ht,wt);
		System.out.println("person details are:"+p1);
		System.out.println("do you want add another details: true or false");
		 flag=sc.nextBoolean();
		
		}while(flag); 
			System.out.println("execution stopped");
		System.out.println(args);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		System.out.println(sa.age);
		System.out.println(sa.colour);
		System.out.println(sa.name);
		
		
	}

}
