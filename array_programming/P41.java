package array_programming;

import java.util.Arrays;

public class P41 {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 4, 6,77, 7, 8, 9, 10 };
		System.out.println(checkSorted(a));
	}

	public static boolean checkSorted(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] >= a[i - 1]) {
			} else
				return false;
		}
		return true;
	}
}
