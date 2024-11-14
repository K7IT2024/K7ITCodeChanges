package com.Babu;

import java.util.Arrays;

public class Diagonal {
	static int k = 28;
	static int a[][] = new int[7][7];

	public static void main(String[] args) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int n = ++k;
				if (i == j || i + j == a.length - 1) {
					System.out.print(a[i][j] = n);
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
			
		}
		
	}

}
