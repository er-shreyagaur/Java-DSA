package array_programming;

import java.util.Arrays;

public class P08 {
	public static void main(String[] args) {
		int[] a = { 2, 5, 10, 3, 4, 67, 14 };
		System.out.print(Arrays.toString(printAlternate(a)));
	}

	public static int[] printAlternate(int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i += 2) {
			a[j++] = a[i];
		}
		return Arrays.copyOfRange(a, 0, j);
	}
}
