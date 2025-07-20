package number_programming;

import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (perfectNum(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.print("Count is: " + count);
	}

	public static boolean perfectNum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (sum == n)
			return true;
		return false;
	}
}
