package number_programming;

import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt();

		for (int i = 50; i <= n; i++) {
			if (checkDissarium(i))
				System.out.println(i + " is a dissarum number");
		}

	}

	public static boolean checkDissarium(int n) {
		int num = n;
		int result = 0;
		int digit = getDigits(n);

		while (digit > 0) {
			int res = num % 10;
			result = result + getPower(res, digit);
			digit--;
			num = num / 10;
		}
		return result == n;
	}

	public static int getDigits(int n) {
		int count = 0;
		while (n > 0) {
			int num = n % 10;
			count++;
			n = n / 10;
		}
		return count;
	}

	public static int getPower(int res, int digit) {
		int mult = 1;
		for (int i = 1; i <= digit; i++) {
			mult = mult * res;
		}
		return mult;
	}

}
