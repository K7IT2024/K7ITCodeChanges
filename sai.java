package com.deva.vara.nani;

import java.util.Arrays;

public class Sai {
	String capitalFirstWord(String[] Sai1) {

		String temp = "";
		String s1="";
		
		for (int i = 0; i < Sai1.length; i++) {

			 

			temp = Sai1[i].substring(0, 1).toUpperCase();
			 temp +=Sai1[i].substring(1);	
	       s1+=temp+" ";
	      
	       temp = " ";
		}
		return s1;
	}

	public static void main(String[] args) {
		Sai d = new Sai();

		String Sai = "sai is my friend";
		String[] Sai1 = Sai.split(" ");
		String capital = d.capitalFirstWord(Sai1);
		System.out.println(capital);	

	}
}
