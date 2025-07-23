package strings;

import java.util.*;

public class P07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.print("No. of Digits: " + count(s));
	}

	public static int count(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c >= 48 && c <= 57)
				count++;
		}
		return count;
	}

}
