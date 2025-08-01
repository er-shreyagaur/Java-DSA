package array_programming;

import java.util.Arrays;
import java.util.Scanner;

public class P40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 7, 4, 3, 5, 1, 6, 8, 2, 10 };
		System.out.print("Enter range: ");
		int n = sc.nextInt();
		System.out.println(findMissing(a, n));
	}

	public static int findMissing(int[] a, int n) {
		int ArraySum = n * (n + 1) / 2;
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		return ArraySum - total;

	}
}
