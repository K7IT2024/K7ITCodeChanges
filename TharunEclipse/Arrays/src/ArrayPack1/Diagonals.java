package ArrayPack1;

public class Diagonals {

	public static void main(String[] args) {
	
		int a[][]=new int[6][6];
		
		
		
		int k=20;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				int m=++k;
				
				if(i==j) {
					System.out.print(a[i][j]=m);
				}
				else if(i+j==a.length-1) {
					System.out.print(a[i][j]=m);
				}
				
				else {
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}
		
		
	}

}