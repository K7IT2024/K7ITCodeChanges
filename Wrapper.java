package com.deva.vara.nani;

public class Wrapper {
	public static void main(String[] args) {
		int i = 10;
		Integer sai = new Integer(i);
		System.out.println(sai);
		Integer sai1 = Integer.valueOf(sai);
		System.out.println(sai1);

		Float f = Float.valueOf(sai);
		Float f1 = Float.valueOf(10);
		System.out.println(f);
		System.out.println(f1);

		Float f2 = Float.valueOf(sai);
		Float f3 = f2.floatValue();
		System.out.println(f3);
 
		Long l1 = Long.valueOf(sai);
		Short s1 = l1.shortValue();
		System.out.println(s1);

		String s = "24";
		int g = Integer.parseInt(s);
		System.out.println(s);
		System.out.println(g);

		String s5 = "24";
		short s6 = Short.parseShort(s5);
		System.out.println(s6);

		String s7 = "23";
		Short s2 = Short.valueOf(s7);
		System.out.println(s2);

		int j = 22;
		Integer d = Integer.valueOf(j);
		String deva = d.toString();
		System.out.println(deva);

		int p = 45;
		Integer p1 = Integer.valueOf(p);
		System.out.println(p1);
		Long p2 = Long.valueOf(10);
		Long p3 = p2.longValue();
		System.out.println(p3);

		String rag = "76";
		int P8 = Integer.parseInt(rag);
		int P4 = Integer.parseInt("76");

		System.out.println(P8);
		System.out.println("76");
		System.out.println(rag);
		System.out.println(P4);

		String k = "123";
		Integer y = Integer.valueOf(k);
		System.out.println(y);
		System.out.println(k);

		Integer c = Integer.valueOf(79);
		String h = c.toString();
		System.out.println(h);

		int X = 44;
		Integer n = Integer.valueOf(X);
		String t = n.toString();
		System.out.println(t); 
		System.out.println(h);
	
		
		

	}

}
