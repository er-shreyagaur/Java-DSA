package number_programming;

import java.util.Scanner;

public class P12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(printFibo(i) + " ");
		}
	}

	public static int printFibo(int n) {
		if (n == 0 || n == 1)
			return n;
		else {
			return printFibo(n - 1) + printFibo(n - 2);
		}
	}

}
