package DynamicPack1;

import java.util.Scanner;


public class Scanner2 {

	public static void main(String[] args) {
		
		boolean b1;
		
		do {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("please enter name");
			
			String name =  sc.next();
			
			System.out.println("please enter age");
			
			int age = sc.nextInt();
			
			System.out.println("please enter height");
			double height=sc.nextDouble();
			
			System.out.println("please enter weight");
			double weight = sc.nextDouble();
			
			
			System.out.println("do you want print anoher Details:true or false");
		     b1=sc.nextBoolean();
			
		}while(b1);
		System.out.println("stopped");
			
		
	}
	
	
}
