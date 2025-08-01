package array_programming;

import java.util.Arrays;

public class P27 {
	public static void main(String[] args) {
		int[] a = { 7, 0, 2, 0, 6, 0, 4 };
		System.out.println("Original array: " + Arrays.toString(a));
		System.out.println("New Array: " + Arrays.toString(moveZeroes(a)));

	}

	public static int[] moveZeroes(int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		return a;
	}
}
