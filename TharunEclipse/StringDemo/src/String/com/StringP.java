package String.com;

public class StringP {

	public static void main(String[] args) {

		// StringP s1 = new StringP();

		String s2 = "Hello_World";
		// s2="";
		//System.out.println(s2.indexOf("H"));

//		for (int i = 0; i < s2.length(); i++) {
//			System.out.println(i);
//			}

//		for (int i =0;i<s2.length();i++) {
//			
//			reverse = s2.charAt(i)+reverse;
		System.out.println(s2.indexOf("H"));
		System.out.println(s2.lastIndexOf("d"));//Lasatindex()
		System.out.println(s2.length());//length()
		System.out.println(s2.charAt(0));//charAt()
		//System.out.println(s2.charAt(90));//String index out of bound exception
		System.out.println(s2.contains("llo"));//true
		System.out.println(s2.contains("111"));//false
		
		System.out.println(s2.replaceAll("e", "1"));//replace
		
		System.out.println(s2.concat(s2));//concat
		
		System.out.println(s2.substring("2"));
		
	}

	}

