package Rockpackage;

import java.util.Properties;

public class Dananjay {
	public static void main(String[] args) {
		int age = Integer.parseInt(System.getProperty("age"));
		String name = System.getProperty("name");
		double ht = Double.parseDouble(System.getProperty("ht"));

		System.out.println("name:" + name + " ,age:" + age + " ,ht:" + ht);

		Properties t = System.getProperties();

		int sai = Integer.parseInt(t.getProperty("sai"));
		String deva = t.getProperty("deva");
		double dhee = Double.parseDouble(t.getProperty("dhee"));

		System.out.println("deva:" + deva + " ,sai:" + sai + " ,dhee:" + dhee);

		Properties l = System.getProperties();

		int vasu = Integer.parseInt(l.getProperty("vasu"));
		String ram = l.getProperty("ram");
		double sitha = Double.parseDouble(t.getProperty("sitha"));

		System.out.println("vasu:" + vasu + " ,ram:" + ram + " ,sitha:" + sitha);

	}

}
