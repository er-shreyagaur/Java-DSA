package recursion_programming;

import java.util.Scanner;

public class P01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int i = sc.nextInt();
		System.out.print("Enter range: ");
		int n = sc.nextInt();

		printNum(i, n);
	}

	public static void printNum(int i, int n) {
		if (i > n)
			return;

		System.out.println(i);
		printNum(i + 1, n);
	}

}
