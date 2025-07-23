package strings;

import java.util.*;

public class P16 {
	public static void main(String[] args) {
		String[] s = { "abc", "car", "ada", "racecar", "cool" };
		System.out.print(firstPallindrome(s));
	}

	public static String firstPallindrome(String[] s) {

		for (String str : s) {
			boolean isPallindrome = true;

			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					isPallindrome = false;
					break;
				}
			}
			if (isPallindrome)
				return str;

		}
		return "";
	}
}