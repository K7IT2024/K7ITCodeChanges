package ArrayPack1;

public class Digonals1 {

	public static void main(String[] args) {
		
		int a[][]= new int[5][5];
		
		for(int i=0;i<5;i++) {
			
			a[i][i]=1;
			
			a[i][5-i-1]=1;
			
			
			}
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			
			System.out.println();
		}
		
	}

}