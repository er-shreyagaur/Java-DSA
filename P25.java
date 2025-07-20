package number_programming;

import java.util.Scanner;

public class P25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		int n = sc.nextInt();
		System.out.print(convertBinToDec(n));

	}

	public static int convertBinToDec(int n) {
		int decimal = 0;
		int twoMultiple = 1;
		while (n > 0) {
			int res = n % 10;
			if (res > 1)
				System.out.print("Not a binary number");

			decimal = decimal + res * twoMultiple;
			n = n / 10;
			twoMultiple = twoMultiple * 2;
		}
		return decimal;
	}
}
