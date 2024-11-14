package devapackage;

public class Bobby {
	// static int y = 14;
//static	int a [][] =new int [5][5];
	public static void main(String[] args) {

		int y = 14;
		int a[][] = new int[17][17];

		for (int b = 0; b < a.length; b++) {

			for (int c = 0; c < a.length; c++) {
				int p = y++;

				if (b == c ) {
					System.out.print(a[c][b] = p);
				}
					
					else if( b + c == a.length - 1) {
					System.out.print(a[c][b] = p);	
					 
				} 
				else {
					System.out.print(" . ");
				}

			}
			System.out.println();
		}

	}

}
