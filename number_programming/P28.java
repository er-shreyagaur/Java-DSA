package number_programming;

import java.util.Scanner;

public class P28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.print(convertDecToHexa(n));
	}

	public static String convertDecToHexa(int n) {
		String hexa = " ";
		while (n > 0) {
			int rem = n % 16;
			hexa = rem + hexa;
			n = n / 16;
		}
		return hexa;
	}
}
