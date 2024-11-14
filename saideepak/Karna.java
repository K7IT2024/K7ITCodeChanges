package Rockpackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Karna {
	public static void main(String[] args) throws IOException {
		Properties t = System.getProperties();
		System.out.println(t);
		FileReader f = new FileReader(
				"C:\\Users\\tripu\\eclipse-workspace\\Romanproject\\src\\Rockpackage\\vasantha.properties");
		System.out.println(f);
		t.load(f);
		System.out.println(f);
		System.out.println(t.getProperty("name"));
		System.out.println(t.getProperty("age"));
		System.out.println(t.getProperty("ht"));
		System.out.println(t.getProperty("wt"));
		System.out.println(t.getProperty("color"));
		System.out.println(t.getProperty("sai"));
		System.out.println(t.getProperty("t"));
		System.out.println(t.getProperty("y"));
		
		
		
		System.out.println(t.getProperty("m"));
		System.out.println(t.getProperty("a"));
		System.out.println(t.getProperty("n"));

	}

}
