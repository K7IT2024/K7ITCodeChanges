package com.actualjava;

public class Strings {

	public static void main(String[] args) {
		String s1 = "Hellooworld";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			String s = "" + s1.charAt(i);
			if (s2.contains(s)) {
				continue;
			} else {
				s2 += s;
			}
		}
		System.out.println(s2);

	}

}
