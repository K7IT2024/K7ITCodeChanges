package propertypack1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {

	public static void main(String[] args) throws IOException {
		
		
		String name = System.getProperty("name");
		
		int age = Integer.parseInt(System.getProperty("age"));
		
		
		System.out.println("Name:"+name+", Age:"+age);
		
		
		
		Properties p2 = System.getProperties();
		
		
      String name1 = System.getProperty("name1");
		
		int age1 = Integer.parseInt(System.getProperty("age1"));
		
		System.out.println("Name1:"+name1+", Age1:"+age1);
		
		
		
		
		
//	   Properties p = System.getProperties();
//		
//	   FileReader r2 = new FileReader("E:\\jdktharun\\TharunEclipse\\Propertiesproject\\src\\propertypack1\\Java.properties");
//		
//		p.load(r2);
//		
//		System.out.println(p.getProperty("name"));
//		System.out.println(p.getProperty("age"));
//		
//
	}

}