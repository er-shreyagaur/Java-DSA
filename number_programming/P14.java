package number_programming;

import java.util.Scanner;

public class P14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt();
		System.out.print("Enter the term: ");
		int t = sc.nextInt();
		int inc = 0;

		for (int i = 0; i <= n; i++) {
			if (checkPrime(i)) {
				inc++;
				if (t == inc)
					System.out.println(i + " is at position " + t + " ,which is also prime");
			}
		}
	}

	public static boolean checkPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		return false;
	}
}
