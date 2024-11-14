package com.Tharun.pack6;

public class SingleTone1 {
	
	private static SingleTone1 s1;
	
	private SingleTone1() {
		
		
	}
	
	
	public static SingleTone1  getInstance() {
		if (s1 == null) {
			s1 =  new SingleTone1();
			return s1;
		}
			else{
				return s1;
			}
		}
		
	public static void main(String[] args) {
		
		System.out.println(s1);
		
		System.out.println(SingleTone1.getInstance());
		
		System.out.println(s1);
		
		
	}
		
		
		
	}
	
	
	
	
	
