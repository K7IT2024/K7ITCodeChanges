package com.actualjava;

public class Anagram {
	private static boolean isAnagrams(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char[] s3 = s2.toCharArray();
			for (int i = 0; i < s3.length; i++) {
				if (s2.contains("" + s3[i])) {
					return true;
				} 
			}
		} else {
			return false;

		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "Babu";
		String s2 = "bBau";
		boolean flag = isAnagrams(s1, s2);
		if (flag) {
			System.out.println("both are anagrams");
		} else {
			System.out.println("both are not anagrams");
		}
	}

}
