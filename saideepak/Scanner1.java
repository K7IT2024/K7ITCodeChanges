package com.deva.vara.nani;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		boolean g;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("name ");
			String name = sc.next();
			System.out.println("age");
			int age = sc.nextInt();
			System.out.println("height");
			double height = sc.nextDouble();
			System.out.println("weight");
			double weight = sc.nextDouble();
			System.out.println("name:" + name + " age:" + age + " weight:" + weight + " height:" + height);
			System.out.println("next person details:true or false");
			g = sc.nextBoolean();
		} while (g);
		System.out.println("execution stopped");

	}

}
