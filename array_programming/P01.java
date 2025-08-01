package array_programming;

import java.util.Arrays;

public class P01 {
	public static void main(String[] args) {
		int[] a = { 12, 18, 20, 15, 28, 47, 58, 69 };

		System.out.println("Array element on even index : ");
		printArray(a);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}
}
