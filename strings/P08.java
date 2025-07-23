package strings;

import java.util.*;

public class P08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		spaceChars(s);
	}

	public static void spaceChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				System.out.println(i + " ");

		}

	}
}
