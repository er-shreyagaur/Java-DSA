package strings;

import java.util.*;

public class P20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.print("Second Largest number: " + secondLargest(s));
	}

	public static int secondLargest(String s) {
		int max = -1;
		int secondMax = -1;
		for (char c : s.toCharArray()) {
			if (c >= 48 && c <= 57) {
				int num = c - 48;
				if (num > max) {
					secondMax = max;
					max = num;
				} else if (num < max && num > secondMax)
					secondMax = num;
			}
		}
		return secondMax;
	}
}
