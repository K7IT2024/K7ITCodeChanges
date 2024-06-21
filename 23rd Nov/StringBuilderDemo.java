package com.k7it.stringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {

		/*
		 * in order to achieve mutable objects in case of string values java people came
		 * up with another alternative class with the name of StringBuilder.
		 * 
		 * for StringBuilder we can able to create objects only one way i.e using new
		 * operator, but we cant create using litteral way.
		 * 
		 * StringBuilder: also works same as String class except immutable feature. here
		 * if we try to change the value of the object it will effect on the same memory
		 * location it wont create new object for each modification
		 * 
		 * append(): this methid will append the given new string value into original
		 * object in the same memory location.
		 * 
		 * public StringBuilder append() {
		 * 
		 * }
		 * 
		 * reverse(): reverse method will reverse the given string automatically.
		 * 
		 * delete(int startIndex, int endIndex):it will delete the portion of string
		 * between specified index, here start index is act like include operation, end
		 * index act like exclude operation.
		 * 
		 * 
		 * both the case if index less than zero or greater than string length or n it
		 * will give the SIOOBE.a
		 * 
		 * insert(int index, String str): this method will insert the new string value
		 * at specified index location inside original object.
		 * 
		 * 
		 * StringBuffer : this is class also act like mutable class like stringbuilder,
		 * but this is class is 100% synchronized class. it will give 100% thread
		 * safety. remaining everything same as StringBuilder class only.
		 * 
		 * String builder is non synchronized class but StringBuffer is synchronized
		 * class Stringbuilder is not thread safety class, but StringBuffer will 100%
		 * thread safety.
		 * 
		 * 
		 * in this class every method is synchronized methods, it means only one thread
		 * can allow at a time.
		 */
		StringBuilder sb = new StringBuilder("K7iT");
		String s = "Lucky";
		System.out.println(sb);
		sb.append("Java");
		s.concat("Vinnu");
		System.out.println(sb);
		System.out.println(s);

		StringBuilder sb1 = new StringBuilder();
		sb1.append("abc");
		sb1.append("xyz");
		sb1.append("pqr");
		sb1.append("456");
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder();
		sb2.append("abc").append("xyz").append("pqr").append("xyz").reverse();

		System.out.println(sb2);// zyxrqpzyxcba
		sb2.delete(3, 6);
		System.out.println(sb2);// zyxzyxcba

		StringBuilder sb7 = new StringBuilder("Hello good morning");
		sb7.insert(5, " evenryone");
		System.out.println(sb7);
		// sb7.insert(-3, " evenryone");//java.lang.StringIndexOutOfBoundsException

		StringBuffer sbuf = new StringBuffer("abc");
		sbuf.append("xyz").append("1234").insert(3, "pqr").delete(5, 9);
		System.out.println(sbuf);// abcpq1234

	}

}
