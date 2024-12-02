package DynamicPack1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Dynamic_values_3rd {


public static void main(String[] args) throws IOException {
	
     
//	String name = System.getProperty("name");
//	
//    int age = Integer.parseInt(System.getProperty("age"));
//    
//    double ht = Double.parseDouble(System.getProperty("ht"));
//	
//	double wt = Double.parseDouble(System.getProperty("wt"));
//	
	
	
	
	Properties p = System.getProperties();
	
	FileReader f = new FileReader("E:\\jdktharun\\TharunEclipse\\DynamicInputs\\src\\DynamicPack1\\MyApplication.Properties");
	
	p.load(f);
	
	System.out.println(p.getProperty("name"));
	System.out.println(p.getProperty("age"));
	System.out.println(p.getProperty("ht"));
	System.out.println(p.getProperty("wt"));
	
	
	
	
	

	//System.out.println("Name:"+name+",Age:"+age+",Ht:"+ht+",wt:"+wt);
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
