package recursion_programming;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		printFibo(a, b, n);

	}

	public static void printFibo(int a, int b, int n) {
		if (n == 0)
			return;
		int c = a + b;
		System.out.print(c + " ");

		printFibo(b, c, n - 1);

	}
}
