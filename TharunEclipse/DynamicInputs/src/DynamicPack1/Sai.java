package DynamicPack1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Sai 
{



	public static void main(String[] args) throws IOException {
		Properties t = System.getProperties();
		FileReader t1 = new FileReader("E:\\jdktharun\\TharunEclipse\\DynamicInputs\\src\\DynamicPack1\\ram.properties");
		t.load(t1);
		
		System.out.println(t.getProperty("name"));
		System.out.println(t.getProperty("age"));
		System.out.println(t.getProperty("ht"));
	}
	
	

}
