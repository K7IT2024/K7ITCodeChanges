package com.Babu;

public class EvenOrOdd {
	int num=235;
	public void check() {
		if(num%2==0) {
			System.out.println("given number is Even");
		}else {
			System.out.println("given number is odd");
		}
		System.out.println("successfully verified");
	}
	public static void main(String[] args) {
		EvenOrOdd e1=new EvenOrOdd();
		e1.check();
	}

}
