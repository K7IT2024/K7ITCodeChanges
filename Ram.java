package com.deva.vara.nani;

public class Ram {
	String s = "";
	String s1 = "";

	String firstWordCapital(String[] ravan) {

		for (int i = 0; i < ravan.length; i++) {
			s = ravan[i];
			s = s.substring(0, 1).toUpperCase();
			s += ravan[i].substring(1);
			s1  += s + " ";
		}

		return s1;   
	}

	public static void main(String[] args) {
		Ram r = new Ram();
		String rock = "hello this is sai";

		String[] ravan = rock.split( " ");
		String deepak = r.firstWordCapital(ravan);
		System.out.println(deepak);

	}

}
