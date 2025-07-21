package number_programming;

import java.util.Scanner;

public class P17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print(checkDissarium(n));
	}

	public static boolean checkDissarium(int n) {
		int num = n;
		int output = 0;
		int digits = getDigits(n);

		while (digits > 0) {
			int number = num % 10;
			output = output + getPower(number, digits);
			digits--;
			num = num / 10;
		}
		return (output == n);
	}

	public static int getDigits(int n) {
		int count = 0;
		int num = n;
		while (n > 0) {
			num = num % 10;
			count++;
			n = n / 10;
		}
		return count;
	}

	public static int getPower(int num, int digits) {
		int ans = 1;
		int i = 1;
		while (i <= digits) {
			ans = ans * num;
			i++;
		}
		return ans;
	}
}