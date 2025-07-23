package strings;

import java.util.*;

public class P04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.print("No.of chars: " + count(s));
	}

	public static int count(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c >= 48 && c <= 57 || c >= 97 && c <= 122 || c >= 65 && c <= 90)
				count++;
		}
		return count++;
	}
}
