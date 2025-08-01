package array_programming;

import java.util.Arrays;

public class P10 {
	public static void main(String[] args) {
		int[] a = { 14, 15, 16, 18, 19, 30 };
		System.out.print(Arrays.toString(reverseAll(a)));
	}

	public static int[] reverseAll(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}
}
