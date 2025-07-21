package number_programming;

import java.util.Scanner;

public class P21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			int result = getSum(i);

			if (result != 0) {
				System.out.println("The strong number is: " + result);
				cnt++;
			}

		}
		System.out.println("Count is: " + cnt);
	}

	public static int printFact(int n) {
		if (n == 0)
			return 1;
		else {
			return n * printFact(n - 1);
		}
	}

	public static int getSum(int n) {
		int sum = 0;
		int num = n;
		while (num > 0) {
			int ld = num % 10;
			sum = printFact(ld) + sum;
			num = num / 10;
		}

		if (sum == n)
			return n;
		else {
			return 0;
		}
	}

}
