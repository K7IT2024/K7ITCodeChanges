package com.deva.vara.nani;

public class Ntr {
	String s ="";
	String s1 = "";

	 String firstWordCapital(String [] sai1) {
		for(int i =0;i<sai1.length;i++) {
			
			s= sai1[i];
			s= s.substring(0,1).toUpperCase();
			s+=sai1[i].substring(1);
			s1+=s+" ";
			
		}
		return s1;
	}
	
	
	
	
public static void main(String[] args) {
	
	Ntr ss = new Ntr();
	String sai = "sai is a zero";
	String [] sai1 = sai.split(" ");
	String capital = ss.firstWordCapital(sai1);
	
	System.out.println(capital);		
	
}	
	
	
	
	
}
