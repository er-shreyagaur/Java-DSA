package strings;

import java.util.*;

public class P03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		System.out.print("No. of characters in string: " + count(s));
	}

	public static int count(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c != ' ')
				count++;
		}
		return count;
	}
}
