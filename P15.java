package number_programming;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		System.out.print("Enter the term: ");
		int t = sc.nextInt();
		int count = 0;
		int i;

		for (i = 1; i <= n; i++) {
			if (checkPal(i)) {
				count++;
				if (t == count) {
					System.out.println("The term at t position is: " + i);
				}
			}
		}

	}

	public static boolean checkPal(int n) {
		int res = 0;
		int num = n;

		while (num > 0) {
			int ld = num % 10;
			res = (res * 10) + ld;
			num = num / 10;
		}
		if (res == n)
			return true;
		return false;
	}
}
