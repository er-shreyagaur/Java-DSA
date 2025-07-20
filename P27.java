package number_programming;

import java.util.Scanner;

public class P27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int res = convertDecToOct(n);
		if (res == -1)
			System.out.print("not an octal number");
		else

			System.out.print(res);
	}

	public static int convertDecToOct(int n) {
		int sum = 0;
		int product = 1;
		while (n > 0) {
			int ld = n % 10;
			if (ld > 7)
				return -1;
			sum = sum + ld * product;
			product = product * 8;
			n = n / 10;
		}
		return sum;
	}
}