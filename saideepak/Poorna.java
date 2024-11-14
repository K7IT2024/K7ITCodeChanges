package Rockpackage;

public class Poorna {

	public static void main(String[] args) {
		int i = 12;
		int f[][] = new int[11][11];
		for (int b = 0; b < f.length; b++) {

			for (int c = 0; c < f.length; c++) {
				int h = i++;
				if (b == c || b + c == f.length - 1) {
					System.out.print(f[b][c] = h);
				} else {
					System.out.print(" % ");
				}

			}
			System.out.println();
		}

	}
}
