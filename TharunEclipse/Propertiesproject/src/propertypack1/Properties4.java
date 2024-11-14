package propertypack1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties4 {

	

	public static void main(String[] args) throws IOException {
	
		
		String name = System.getProperty("name");
		
		Double ht = Double.parseDouble(System.getProperty("ht"));
		
		
		System.out.println("Name:"+name+",Ht:"+ht);
		
		
		
		Properties p4 = System.getProperties();
		
		FileReader f1 = new FileReader("E:\\jdktharun\\TharunEclipse\\Propertiesproject\\src\\propertypack1\\MyK7it.Properties");
		
         p4.load(f1);
         
         
         System.out.println(p4.getProperty("name"));
         System.out.println(p4.getProperty("ht"));
         System.out.println(p4.getProperty("name"));
	}

}
