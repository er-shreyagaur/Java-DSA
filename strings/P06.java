package strings;

import java.util.*;

public class P06 {
	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.print("No.of chars: " + count(s));
	}

	public static int count(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				count++;
		}
		return count;
	}
}
