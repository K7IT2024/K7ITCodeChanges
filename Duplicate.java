package com.actualjava;

public class Duplicate {

	public static void main(String[] args) {
		String s="babu reddu babu reddy";
		String result="";
		String[] s3=s.split(" ");
		for(int i=0;i<s3.length;i++) {
			if(!result.contains(s3[i])) {
				result=result+s3[i]+" ";
			}
		}
		System.out.println(result);
		String[] s4=result.split(" ");
		for(int i=0;i<s4.length;i++) {
			int count=0;
			for(int j=0;j<s3.length;j++) {
				if(s4[i].equals(s3[j])) {
					count++;
				}
				
			}
			System.out.println(count);
		}
	}
	
}
