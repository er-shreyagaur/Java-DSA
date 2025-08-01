package array_programming;

import java.util.Arrays;

public class P37 {
	public static void main(String[] args) {
		int[] a = { 56, 45, 68, 24, 16, 89 };
		System.out.print(Arrays.toString(descendingArray(a)));

	}

	public static int[] descendingArray(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
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
