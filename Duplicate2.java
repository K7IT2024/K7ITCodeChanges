package StringPack1;

public class Duplicate2 {

	public static String main(String[] args) {

		String s = "hello world my name is java";

		String result = "";

		String[] s1 = s.split("");

		for (int i = 0; i < s1.length; i++) {

			if (!result.contains(s1[i])) {

				result = result+ s1[i];
			}

		}

		System.out.println(result.trim());
		
		return result.trim();

		
		
			}

}
