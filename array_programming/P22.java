package array_programming;

import java.util.Arrays;

public class P22 {
	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 7, 7, 5, 10, 1, 2, 11, 11 };
		int[] result = printArray(a);
		System.out.println(Arrays.toString(result));

	}

	public static int[] printArray(int[] a) {
		int small = a[0];
		int Ssmall = Integer.MAX_VALUE;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] < small) {
				Ssmall = small;
				small = a[i];
			} else if (a[i] > small && a[i] < Ssmall) {
				Ssmall = a[i];
			}

		}
		return new int[] { small, Ssmall };
	}
}
