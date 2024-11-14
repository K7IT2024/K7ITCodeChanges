package com.Babu;

import java.util.Arrays;

public class Dimensional {
	public static void main(String[] args) {
		int s = 1;
		int a[][][] = new int[5][5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {

					a[i][j][k] = s++;
					System.out.print(a[i][j][k] + " ");

				}
				System.out.println();
			}

			System.out.println();

		}

	}

}
