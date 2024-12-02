package ArrayPack1;

public class Digonals3 {

	public static void main(String[] args) {
		
		int a[][][]=new int [4][4][4];
		
		int m=10;
		for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a.length;j++) {
				 for(int k=0;k<a.length;k++) {
					 int n=++m;
					 
					if(i==j||i==k||j==k||k==i||i+j+k==a.length-1) {
						System.out.print(a[i][j][k]=n);
					}else {
						System.out.print(" * ");
					}
						
					 
			 }
				 
				 
			 }
			
			
			System.out.println();
			System.out.println(" ");
		}

	}

}
