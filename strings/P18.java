package strings;

import java.util.*;

public class P18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.print("No. of words: " + countWords(s));
	}

	public static int countWords(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i == 0 && c != ' ' || c != ' ' && s.charAt(i - 1) == ' ')
				count++;
		}
		return count;
	}

}
