package number_programming;

import java.util.Scanner;

public class P06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (checkPrime(i)) {

				if (checkPrime(getSum(i))) {
					System.out.println(i);
					count++;
				}
			}
		}
		System.out.println("Count is: " + count);

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

	public static int getSum(int a) {
		int sum = 0;
		while (a > 0) {
			int num = a % 10;
			sum = sum + num;
			a = a / 10;
		}
		return sum;
	}
}
