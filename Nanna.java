package com.deva.vara.nani;

public class Nanna {

	static int y = 14;
	static int a[][] = new int[5][5];

	public static void main(String[] args) {

		

		for (int h = 0; h < a.length; h++) {

			for (int u = 0; u < a.length; u++) {

				a[h][u] = y;
				 System.out.print(y++ + " " );
				//System.out.println(a[0][2]);
			}
			System.out.println();
		}
		System.out.println("==============================");
		for (int h = 0; h < a.length; h++) {

			for (int u = 0; u < a.length; u++) {

//				 System.out.print(y++ + " " );
				System.out.print(a[h][u]);
				System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("==============================");


	}

}
