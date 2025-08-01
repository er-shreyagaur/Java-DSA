package array_programming;

import java.util.Arrays;

public class P38 {
	public static void main(String[] args) {
		int[] a = { 25, 34, 12, 45, 23, 28 };
		System.out.print(Arrays.toString(sortingArray(a)));
	}

	public static int[] sortingArray(int[] a) {
		int mid = a.length / 2;
		for (int i = 0; i < mid; i++) {
			for (int j = 0; j < mid - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = mid; i < a.length - 1; i++) {
			for (int j = mid; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}
}
