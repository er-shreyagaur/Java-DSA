package number_programming;

import java.util.Scanner;

public class P26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.print(convertDecToOct(n));
	}

	public static String convertDecToOct(int n) {
		String octal = " ";
		while (n > 0) {
			int rem = n % 8;
			octal = rem + octal;
			n = n / 8;
		}
		return octal;
	}
}
