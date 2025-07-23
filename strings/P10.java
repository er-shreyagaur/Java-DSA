package strings;

import java.util.*;

public class P10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.print(checkString(s));
	}

	public static boolean checkString(String s) {
		for (char c : s.toCharArray()) {
			if (c < 48 || c > 57)
				return false;
		}
		return true;
	}
}
