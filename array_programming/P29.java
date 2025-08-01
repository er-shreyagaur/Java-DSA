package array_programming;

import java.util.Arrays;

public class P29 {
	public static void main(String[] args) {
		int[] a = { 0, 2, 0, 1, 2, 1, 0, 2 };
		System.out.println(Arrays.toString(sortArray(a)));
	}

	public static int[] sortArray(int[] a) {
		int low = 0;
		int mid = 0;
		int high = a.length - 1;
		while (mid <= high) {
			if (a[mid] == 0) {
				swap(a, low, mid);
				low++;
				mid++;
			} else if (a[mid] == 1)
				mid++;
			else {
				swap(a, mid, high);
				high--;
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
