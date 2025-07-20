package recursion_programming;

import java.util.Scanner;

public class P08 {
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int n = sc.nextInt();
		getSum(n);
		System.out.println("The sum for digit " + n + " is: " + sum);
	}

	public static int getSum(int n) {
		if (n == 0)
			return 0;
		int ld = n % 10;
		sum = sum + ld;
		n = n / 10;
		getSum(n);
		return sum;
	}
}
