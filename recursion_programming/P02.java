package recursion_programming;

import java.util.Scanner;

public class P02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Starting range: ");
		int i = sc.nextInt();
		System.out.print("Enter the value: ");
		int n = sc.nextInt();

		printTable(i, n);
	}

	public static void printTable(int i, int n) {
		if (i > 10)
			return;
		System.out.println(n + " * " + i + " = " + n * i);

		printTable(i + 1, n);
	}
}
