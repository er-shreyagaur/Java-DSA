package strings;

import java.util.*;

public class P22 {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Arrays.toString(getFrequency(s)));
	}

	public static int[] getFrequency(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90)
				freq[c - 65]++;
			else if (c >= 97 && c <= 122)
				freq[c - 97]++;
		}
		return freq;
	}
}
