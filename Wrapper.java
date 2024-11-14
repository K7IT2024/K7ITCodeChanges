package com.actualjava;

public class Wrapper {
	String s="162534";
	int i1=56754;
	Integer i3=Integer.valueOf(23536);
	int ii=i3.intValue();
	int i4=i3.intValue();
	Integer i2=Integer.valueOf(i1);
	String str=i2.toString(i1);
	String s1=new String(s);
	int i=Integer.parseInt(s);
	Double d1=Double.parseDouble(s);
	Double d=Double.valueOf(i1);
	Double d2=Double.valueOf(s);
	Float f=Float.valueOf(i1);
	Float f2=Float.valueOf(s);
	Integer decimal=Integer.valueOf(234);
	
	public static void main(String[] args) {
		Wrapper wp=new Wrapper();
		System.out.println(wp.i);
		System.out.println(wp.i2);
		System.out.println(wp.str);
		System.out.println(wp.d);
		System.out.println(wp.d2);
		System.out.println(wp.f);
		System.out.println(wp.f2);
		System.out.println(wp.d1);
		System.out.println(wp.i3);
		System.out.println(wp.i4);
		System.out.println(wp.decimal.toHexString(234));
		System.out.println(wp.decimal.toBinaryString(234));
		System.out.println(wp.decimal.toOctalString(234));
		System.out.println(wp.ii);
	}

}
