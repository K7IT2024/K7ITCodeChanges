package DynamicPack1;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		
		
	Boolean flag;
	
	
		do {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("please enter your name");
		String name = sc.next();
		
		System.out.println("please enter your age");
			int age = sc.nextInt()	;
			
			System.out.println("please enter you height");
				double height =sc.nextDouble();	
		
		System.out.println("please enter your weight");
		       double weight = sc.nextDouble();
		
		
		System.out.println("next Details:true or False");
		flag=sc.nextBoolean();
		
		
	}
		while(flag);
		
		System.out.println("stopped");
         System.out.println(args);
         System.out.println(args[0]);
         System.out.println(args[1]);
}
}