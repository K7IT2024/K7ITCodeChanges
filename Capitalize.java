package com.actualjava;

public class Capitalize {

	private String capitalizeFirstWord(String[] chars) {
		String result = "";
		String babu = "";
		for (int i = 0; i < chars.length; i++) {

			result = chars[i];

			result = result.substring(0, 1).toUpperCase();
			result += chars[i].substring(1);
			babu += result + " ";

		}
		return babu;
	}

	public static void main(String[] args) {

		Capitalize cap = new Capitalize();
		String s1 = "printing first letter of every word capital";
		String[] chars = s1.split(" ");

		String capital = cap.capitalizeFirstWord(chars);
		System.out.println(capital);

	}

}
