package strings;

import java.util.*;

public class P19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.print("Biggest number: " + biggestNumber(s));
	}

	public static int biggestNumber(String s) {
		int max = -1;
		for (char c : s.toCharArray()) {
			if (c >= 48 && c <= 57) {
				int num = c - 48;
				if (num > max)
					max = num;
			}
		}
		return max;
	}
}
