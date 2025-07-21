package recursion_programming;

import java.util.Scanner;

public class P12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter position: ");
		int n = sc.nextInt();

		System.out.println("The digit at " + n + "th position: " + printFibo(n));
	}

	public static int printFibo(int n) {
		int fib = 0;
		if (n == 0 || n == 1)
			return n;

		else
			fib = printFibo(n - 1) + printFibo(n - 2);

		return fib;
	}
}
