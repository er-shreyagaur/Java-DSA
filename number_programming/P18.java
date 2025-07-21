package number_programming;

import java.util.Scanner;

public class P18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print(checkAutomorphic(n));

	}

	public static boolean checkAutomorphic(int n) {
		int square = n * n;

		while (n > 0) {
			int result = n % 10;
			int lastDigit = square % 10;

			if (result != lastDigit)
				return false;

			n = n / 10;
			square = square / 10;
		}
		return true;
	}

}
