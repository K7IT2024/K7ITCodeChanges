package propertypack1;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Boolean flag;
		
		do {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter your name");
		
		String name = sc.next();
		
		System.out.println("please eneter your age");
		
		int age = sc.nextInt();
		
		
		
		System.out.println("please eneter you ht");
		
		double ht = sc.nextDouble();
		


		System.out.println("please eneter you ht");
		
		double wt = sc.nextDouble();
		
		

		System.out.println("next details print or not");
		
		flag = sc.nextBoolean();
		
		
	}while(flag);
		
		System.out.println("stopped");
}
}