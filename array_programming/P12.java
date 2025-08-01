package array_programming;

import java.util.Arrays;

public class P12 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		reverseArray(a);
		System.out.print(Arrays.toString(a));

	}

	public static void reverseArray(int[] a) {
		int mid = a.length / 2;
		reverse(a, 0, mid - 1);
		reverse(a, mid, a.length - 1);

	}

	public static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}
