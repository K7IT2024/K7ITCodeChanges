package com.scanner;

public class Babureddy {
	
	 Babureddy(String string) {
		System.out.printf(string);
	}
	

	Babureddy(String s,String s2){
		System.out.printf(s+" "+s2);
	}
	public static void main(String[] args) {
		
		Babureddy b[]=new Babureddy[3];
		b[0]=new Babureddy("reddy");
		System.out.println();
		b[1]=new Babureddy("reddy","babu");
		System.out.println();
		
		int a[]= {22,23,34,45,56};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		String s[]= {"namah","shivaya","jai","shree","ram"};
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		
	}

}
