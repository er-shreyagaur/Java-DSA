package strings;

import java.util.*;

public class P24 {
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printChar(s);

	}

	public static void printChar(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90)
				freq[c - 65]++;
			else if (c >= 97 && c <= 122)
				freq[c - 97]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 1)
				System.out.println((char) (i + 97));
		}
	}
}
