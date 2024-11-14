package StringPack1;

public class UpperCase {

	private static String firstLetterUpperCase(String[] s4) {
		String s1 = "";
		String s2 = "";

		for (int i = 0; i < s4.length; i++) {

			//s1 += s4[i].substring(1);

			s1 = s4[i];

			s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);

			// s1+=s4[i].substring(1);

			s2 += s1 + " ";
		}
		return s2;
	}

	public static void main(String[] args) {

		UpperCase u = new UpperCase();

		String s3 = "my name is tharun";

		String[] s4 = s3.split(" ");

		String result = u.firstLetterUpperCase(s4);
		System.out.println(result);

	}

}
