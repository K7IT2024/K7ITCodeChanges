package ArrayPack1;

public class digonals {

	public static void main(String[] args) {

		int a[][] = new int[6][6];

		int m = 10;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				int n = ++m;

				if (i == j) {
					System.out.print(a[i][j] = n);

				} else if(i+j==a.length-1){
					System.out.print(a[i][j]=n);
				}else {
					System.out.print(" * ");
				}

			}
			System.out.println();

		}

	}

}