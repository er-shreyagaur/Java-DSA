package number_programming;

import java.util.Scanner;

public class P24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print(convertDecToBin(n));

	}

	public static String convertDecToBin(int n) {
		String bin = "";
		while (n > 0) {
			int result = n % 2;
			bin = result + bin;
			n = n / 2;
		}
		return bin;
	}

}
