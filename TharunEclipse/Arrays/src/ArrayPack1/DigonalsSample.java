package ArrayPack1;

public class DigonalsSample {

	public static void main(String[] args) {

		int a[][] = new int[4][4];

		int p = 10;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int k = ++p;

				if (i == j || i + j == a.length - 1) {
					System.out.print(a[i][j]=k);

				} else {

					System.out.print(" * ");

				}

			}
                System.out.println();
		}
	}

}