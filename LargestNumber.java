package devapackage;

import java.util.Scanner;

public class LargestNumber {
//	static int a = 18;
	//static int b = 12;
	//static int c = 12;
	

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("enter a value");
		int a = t.nextInt();
		
		
		System.out.println("enter b value");
		int b= t.nextInt();
		
		System.out.println("enter c value");
		int c = t.nextInt();
		
		
		if (a > b && a > c) {
			System.out.println("a is a largest number");
			System.out.println("a:" + a);
		}
		else if(b>a &&  b >c) {
			System.out.println("b is a largest number");
			System.out.println("b:"+b);
			}
		
		else if(c>a &&  c >b) {
			System.out.println("c is a largest number");
			System.out.println("c:"+c);
			}
		

		else {
			System.out.println("not a largest number");
		}


	}
}
