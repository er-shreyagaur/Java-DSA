package number_programming;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (checkAutomorphic(i))
				System.out.println(i + " is an automorphic number");
		}
	}

	public static boolean checkAutomorphic(int n) {
		int square = n * n;

		while (n > 0) {
			int result = n % 10;
			int ld = square % 10;

			if (result != ld)
				return false;

			n = n / 10;
			square = square / 10;
		}
		return true;
	}
}
