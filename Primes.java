package com.k7it.Assignment2;

import java.util.Scanner;

public class Primes {
//one and itself
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("prime no.:" + i);
			}
		}
	}
}
