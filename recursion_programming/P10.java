package recursion_programming;

import java.util.Scanner;

public class P10 {
	static int rev = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int n = sc.nextInt();

		System.out.println(checkPalindrome(n));
	}

	public static boolean checkPalindrome(int n) {
		if (n == 0)
			return false;
		int digit = n;
		int ld = digit % 10;
		rev = rev * 10 + ld;
		digit = digit / 10;
		checkPalindrome(digit);
		if (rev == n)
			return true;
		return false;
	}
}
