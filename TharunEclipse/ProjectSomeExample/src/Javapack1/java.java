package Javapack1;

public class java {

	public static void main(String[] args) {

		String s = "java java to love you";
		String result = "";
		String tharun = "";

		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {

			result = s1[i];

			result = s1[i].substring(0, 1).toUpperCase();

			result = result + s1[i].substring(1);

			tharun += result + " ";

			

		}
System.out.println(tharun);
	}
}
