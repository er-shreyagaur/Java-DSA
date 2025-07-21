package number_programming;

import java.util.Scanner;

public class P29 {

	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(convertHexToDec(n));
	}

	public static int convertHexToDec(int n) {
		int sum = 0;
		int temp = 1;
		while (n > 0) {
			int ld = n % 10;
			sum = sum + temp * ld;
			temp = temp * 16;
			n = n / 10;
		}
		return sum;
	}
}
