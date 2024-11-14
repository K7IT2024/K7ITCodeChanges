package com.actualjava;

public class Duplicates {
	
	public static void main(String[] args) {
		
	
	String s="welcome to k7infotech";
	String s1=s.substring(4,8);
	String s2=s.substring(9,11);
	String s3=s.substring(12,15);
	String s4="k7"; 
	String s5=new String(s.substring(4,7));	
	
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	System.out.println(s.equals(s1));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1==s2);
	
}
}
