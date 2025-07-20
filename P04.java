package number_programming;

import java.util.Scanner;

public class P04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.print("Count is: " + count);
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
