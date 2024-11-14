package DynamicPack1;


import java.util.Scanner;


public  class Scanner1{
   int age;
   String name;
   double height;
   double weight;
   

	public static void main(String[] args) {
		
		Scanner1 s1= new Scanner1();
		s1.age=20;
		s1.name="java";
		s1.height=5.0;
		s1.weight=80.00;
		
		
		
		
		boolean flag;
		
		do {
		Scanner sc = new Scanner(System.in );
		
		
		
		System.out.println("please enter your name");
		String name = sc.next();
		
		System.out.println("please enter your age");
		int age = sc.nextInt();
		
		
		System.out.println("please enter your height");
		double height=sc.nextDouble();
		
		
		System.out.println("please enter your weight");
		double weight=sc.nextDouble();
		
		
	System.out.println("do you want print another Details:please enter true or false");
		 flag = sc.nextBoolean();
		}
		while(flag) ;
		
		
		
		System.out.println("execution stopped");
		
		
		System.out.println(args);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.height);
		System.out.println(s1.weight);
	}

}
