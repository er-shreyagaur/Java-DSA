package strings;

import java.util.*;

public class P21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.print("Unique Character string: " + printOnce(s));
	}

	public static String printOnce(String s) {
		String str = " ";
		for (char c : s.toCharArray()) {
			if (!str.contains(c + ""))
				str = str + c;
		}
		return str;
	}
}
