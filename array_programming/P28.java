package array_programming;

import java.util.Arrays;

public class P28 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 1, 0, 1, 0, 0 };
		System.out.println(Arrays.toString(sortArray(a)));

	}

	public static int[] sortArray(int[] a) {
		int low = 0;
		int high = 0;
		while (high < a.length) {
			if (a[high] == 0) {
				swap(a, low, high);
				low++;
				high++;
			} else if (a[high] == 1) {
				high++;
			}
		}
		return a;
	}

	public static void swap(int[] a, int start, int end) {
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
	}
}
