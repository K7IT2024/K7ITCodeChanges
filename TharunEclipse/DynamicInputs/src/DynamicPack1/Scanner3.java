package DynamicPack1;

import java.util.Scanner;

public class Scanner3 {

	
	
	public static void main(String[] args) {
		
		Boolean flag = false;
		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("please enter name");
			String name = sc.next();
			
			
			System.out.println("please enter age");
			int age = sc.nextInt();
			
			System.out.println("please enter height");
			double height=sc.nextDouble();
			
			System.out.println("please enter height");
			double weight=sc.nextDouble();
			
		
			System.out.println("do u want print another details:true/false");
		   flag = sc.hasNextBoolean();
			
		
		}while(flag);
		
		System.out.println("stop");
		}
		}
		
		
		
		
	
	
	
	
	
	
	
	

