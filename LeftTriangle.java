public class LeftTriangle
{
	static public void main(String args[]){
		int rows=5;
		for(int i=1;i<=rows;i++){
			for(int j=5;j>i;j--){
				System.out.println("");
			}
			for (int k=1;k<=i;k++){
				System.out.println("* ");
			}
			System.out.println();
		}
	}
}