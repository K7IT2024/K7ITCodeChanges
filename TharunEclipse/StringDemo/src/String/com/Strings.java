package String.com;

public class Strings {

	static  String s1 = "abc";

	 static  String s2 = new String("xyz");

	static String s3 = "xyz";

	static String s4 = "abc";

	static String s5 = "abc" + "123";

	static String s6 = "abc" + "123";

	static String s11 = s1 + "123";

	static String s13 = "123";

	static String s12 = s1 + s13;

	static String s7 = s1 + "pqr";
	
	String s8 = s1+s3;
	
	String s9 = new String("abcxyz");
	
	String S10 = new String ("abc");
	
	
	public static void main(String[] args) {
//		
	String s2 = new String();
System.out.println(s2);
//		 String s1 = "abc";
//
//		 String s2 = new String("xyz");
//
//		String s3 = "xyz";
//
//		String s4 = "abc";
//
//		String s5 = "abc" + "123";
//
//		String s6 = "abc" + "123";
//
//		String s11 = s1 + "123";
//
//		String s13 = "123";
//
//		String s12 = s1 + s13;
//
//		String s7 = s1 + "pqr";
//		
//		String s8 = s1+s3;
//		
//		String s9 = new String("abcxyz");
//		
//		String s10 = new String ("abc");
//		
//		
//		
//		System.out.println(s9);
//		System.out.println(s10);
//		
//		
//		System.out.println(s1);
//		
//	
//	
		
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println(s1.toString());
		
		System.out.println();
	}
}
