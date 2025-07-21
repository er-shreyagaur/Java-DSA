package recursion_programming;

import java.util.Scanner;

public class P03 {
	static int sum = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting: ");
		int i = sc.nextInt();
		System.out.print("Enter the range:");
		int n = sc.nextInt();

		printSum(i, n);
		System.out.println(sum);
	}

	public static int printSum(int i, int n) {

		if (i > n) {
			return 0;
		}

		sum = sum + i;
		printSum(i + 1, n);
		return sum;
	}
}
