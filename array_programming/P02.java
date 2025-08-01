package array_programming;

import java.util.Arrays;

public class P02 {
	public static void main(String[] args) {
		int[] a = { 12, 18, 20, 15, 28, 47, 58, 69 };

		System.out.println("Array with even element: ");
		printEven(a);
	}

	public static void printEven(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i]);
		}

	}
}
