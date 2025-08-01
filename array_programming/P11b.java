package array_programming;

import java.util.Arrays;

public class P11b {
	public static void main(String[] args) {
		int[] a = { 2, 5, 4, 37, 10 };
		System.out.print(Arrays.toString(printReverse(a)));
	}

	public static int[] printReverse(int[] a) {
		int start = a.length - 1;
		int end = 0;
		while (start > end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;

			start--;
			end++;
		}
		return a;
	}

}
