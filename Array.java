package com.scanner;

public class Array {
 	String[] s;
	 int a[];
	
	public static void main(String[] args) {
		
		String []s=new String[2];
		int q=232;
		for(int i=0;i<s.length;i++) {
			s[i]=q+"12";
			System.out.println(s[i]);
		}
		int []a=new int[3];
		int l=232; 
		for(int i=0;i<a.length;i++) {
			a[i]=l++;
			System.out.println(a[i]);
		}
		Person p[]=new Person[2];
		
		p[0]=new Person("babu",30,71.5,5.6);
		System.out.println(p[0]);
		System.out.println(p[1]);
		
		
		
		
	}

}	