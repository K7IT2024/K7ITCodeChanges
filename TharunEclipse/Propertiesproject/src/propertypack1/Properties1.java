package propertypack1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {

	
	
	public static void main(String[] args) throws IOException {
		
		
		String name = System.getProperty("name");
		
		int age = Integer.parseInt(System.getProperty("age"));
		
		double ht = Double.parseDouble(System.getProperty("ht"));
		
		double wt = Double.parseDouble(System.getProperty("wt"));
		
		
		System.out.println("Name:"+name+",Age:"+age+",Ht:"+ht+",wt:"+wt);
		
   
		
		
		Properties p2= System.getProperties();
		
		String name1= System.getProperty("name1");
		
		int age1 = Integer.parseInt(System.getProperty("age1"));
		
		double ht1 = Double.parseDouble(System.getProperty("ht1"));
		
		double wt1 = Double.parseDouble(System.getProperty("wt1"));
		
	
		
		System.out.println("Name1:"+name1+",Age1:"+age1+",Ht1:"+ht1+",wt1:"+wt1);

		System.out.println(p2);
		
		
		
		
		Properties p3= System.getProperties();
		
		String name2= System.getProperty("name1");
		
		int age2 = Integer.parseInt(System.getProperty("age1"));
	
	double ht2= Double.parseDouble(System.getProperty("ht1"));
	
		double wt2 = Double.parseDouble(System.getProperty("wt1"));	
		
        
	   
        System.out.println("Name2:"+name2+",Age2:"+age2+",Ht2:"+ht2+",wt1:"+wt2);
       System.out.println(p3);
		
		Properties p1 = System.getProperties();
		
		FileReader r1 = new FileReader("E:\\jdktharun\\TharunEclipse\\Propertiesproject\\src\\propertypack1\\MyFile.Properties");
		
		p1.load(r1);
		
		
		
		System.out.println(p1.getProperty("name"));
	System.out.println(p1.getProperty("age"));
	System.out.println(p1.getProperty("ht"));
	System.out.println(p1.getProperty("wt"));
		
	
	//System.out.println(args);
	
		
		
	}

	

}








































































//String name = System.getProperty("name");
//
//int age = Integer.parseInt(System.getProperty("age"));
//
//double ht = Double.parseDouble(System.getProperty("ht"));
//
//double wt = Double.parseDouble(System.getProperty("wt"));
//
//
//System.out.println("Name:"+name+",Age:"+age+",Ht:"+ht+",wt:"+wt);
//
