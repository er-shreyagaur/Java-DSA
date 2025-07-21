package number_programming;

import java.util.Scanner;

public class P05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (checkPrime(i)) {
				cnt++;
				if (cnt % 2 == 1) {
					System.out.println(i);

				}
			}
		}
		System.out.print("Count is: " + cnt);
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
