package strings;

import java.util.*;

public class P17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.print("Unique Character string: " + removeDuplicate(s));
	}

	public static String removeDuplicate(String s) {
		String unique = " ";
		for (char c : s.toCharArray()) {
			if (!unique.contains(c + ""))
				unique = unique + c;
		}
		return unique;
	}
}
