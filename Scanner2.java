package com.scanner;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		boolean flag;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your wt");
		double wt=sc.nextDouble();
		System.out.println("enter your ht");
		double ht=sc.nextDouble();
		System.out.println("add another person details");
		 flag=sc.nextBoolean();
		}while(flag);
		System.out.println("ika chaalu avasaram ledu");
		System.out.println(args);
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
	}

}
