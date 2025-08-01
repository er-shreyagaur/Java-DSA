package array_programming;

import java.util.Arrays;
import java.util.Scanner;

public class P44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		if (n <= 2)
			System.out.println(0);
		System.out.print(countPrime(a));

	}

	public static int countPrime(int[] a) {
		for (int i = 2; i < a.length; i++) {
			a[i] = 1;
		}

		for (int i = 2; i * i < a.length; i++) {
			if (a[i] == 1) {
				for (int j = i * i; j < a.length; j += i) {
					a[j] = 0;
				}
			}
		}
		int count = 0;
		for (int i = 2; i < a.length; i++) {
			if (a[i] == 1)
				count++;
		}
		return count;
	}
}
