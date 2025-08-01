package array_programming;

import java.util.Arrays;

public class P30 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 6, 7, 8, 9 };
		System.out.print(checkArray(a));
	}

	public static boolean checkArray(int[] a) {
		int i = 0;
		for (int j = i + 1; j < a.length; j++) {
			if (a[j] == a[i])
				return false;

			i++;
		}
		return true;
	}
}
