package com.Babu;

import java.util.Arrays;
import java.util.Comparator;

public class BabuArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=24;
		a[1]=34;
		a[2]=23;
		a[3]=21;
		a[4]=25;
		
		Arrays.sort(a);
		for(int v:a)
			System.out.print(v+" ");
//		Arrays.sort(a,Comparator.reverseOrder());
//		for(int  d:a)
//			System.out.println(d);
//		
	}

}
