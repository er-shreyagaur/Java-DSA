package array_programming;

import java.util.Arrays;

public class P31 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7 };
		int[] b = { 2, 3, 4, 5, 6, 7 };
		System.out.println(checkArrays(a, b));

	}

	public static boolean checkArrays(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
}
