package recursion_programming;

import java.util.Scanner;

public class P04 {
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int i = sc.nextInt();
		System.out.print("Enter range: ");
		int n = sc.nextInt();

		printSquare(i, n);
		System.out.println(sum);
	}

	public static int printSquare(int i, int n) {
		if (i > n) {
			return 0;
		}
		sum = sum + i * i;
		printSquare(i + 1, n);
		return sum;

	}
}
