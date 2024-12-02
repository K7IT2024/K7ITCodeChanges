package com.Tharun.pack6;

public class SingleTone3 {

	private static SingleTone3 s3;
	

	private SingleTone3() {
	}

	public static SingleTone3 getInstance() {
		
		if (s3==null) {
			s3= new SingleTone3();
			return s3;
		}else
	       return s3;
		}
	
	public static void main(String[] args) {
		System.out.println(s3 );
		System.out.println(s3);
		System.out.println(SingleTone3.getInstance());
		System.out.println(s3 );
		System.out.println(s3);
	}
	
}
