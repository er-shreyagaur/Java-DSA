package number_programming;

import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(getSum(n));
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
		System.out.println("Sum of factorials: " + sum);
		if (sum == n)
			return n;
		return 0;
	}

}
