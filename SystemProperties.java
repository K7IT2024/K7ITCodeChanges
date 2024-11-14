package com.scanner;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {
	public static void main(String[] args) throws IOException {
		String name=System.getProperty("name");
		int age=Integer.parseInt(System.getProperty("age"));
		double ht=Double.parseDouble(System.getProperty("ht"));
		double wt=Double.parseDouble(System.getProperty("wt"));
		
		System.out.println("name:"+name+",age:"+age+",ht:"+ht+",wt:"+wt);
		Properties p=System.getProperties();
		String name1=p.getProperty("name1");
		int age1=Integer.parseInt(p.getProperty("age1"));
		double ht1=Double.parseDouble(p.getProperty("ht1"));
		double wt1=Double.parseDouble(p.getProperty("wt1"));
		//System.out.println(p);
		System.out.println("name1:"+name1+",age1:"+age1+",wt1:"+wt1+",ht1:"+wt1);
		
		Properties p1=System.getProperties();
		String name2=p1.getProperty("name2");
		int age2=Integer.parseInt(p1.getProperty("age2"));
		double ht2=Double.parseDouble(p1.getProperty("ht2"));
		double wt2=Double.parseDouble(p1.getProperty("wt2"));
		System.out.println("name2:"+name2+",age2:"+age2+",wt2:"+wt2+",ht2:"+wt2 );
		
		Properties p2=System.getProperties();
		FileInputStream fin=new FileInputStream("C:\\Users\\tirup\\eclipse-workspace\\JavaProject\\Props");
		p2.load(fin);
		System.out.println(p2.getProperty("name"));
		System.out.println(p2.getProperty("age"));
		System.out.println(p2.getProperty("ht"));
		System.out.println(p2.getProperty("wt"));
		System.out.println(args);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		Properties p3=System.getProperties();
		FileReader fr=new FileReader("C:\\Users\\tirup\\eclipse-workspace\\JavaProject\\Props");
		p3.load(fr);
		System.out.println(p2.getProperty("name"));
		System.out.println(p2.getProperty("age"));
		System.out.println(p2.getProperty("ht"));
		System.out.println(p2.getProperty("wt"));

		
		
	}

}
