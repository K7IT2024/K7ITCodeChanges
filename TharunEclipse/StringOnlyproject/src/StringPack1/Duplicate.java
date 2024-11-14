package StringPack1;

public class Duplicate {

	public static void main(String[] args) {

		String s = "1231234";

		String s1 = "";

		for (int i = 0; i < s.length(); i++) {

			String s2 = ""+s.charAt(i);
			//s.charAt(i);

			if (s1.contains(s2)) {
				continue;
			} else {
				s1 += s2;
			}
		}

		System.out.println(s1);
		
	}

}
