package Examplespack1;

public class Examples {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
		
		for(int j=0;j<n;j++) {
		
			if(i==0||i==n-1||i==j||j==0||j==n-1||j==n-i-1) {
			
		System.out.println("* ");
		
			}else {
				System.out.println(" ");
			}
		
		}
		System.out.println();
	}

	}
}