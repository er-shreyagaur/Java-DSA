package array_programming;

import java.util.Arrays;

public class P39 {
	public static void main(String[] args) {
		int[] a = { 12, 23, 16, 15, 23, 12 };
		System.out.print(checkArray(a));
	}

	public static boolean checkArray(int[] a) {
		int i = 0;
		for (int j = a.length - 1; j > 0; j--) {
			if (a[j] != a[i])
				return false;
			i++;
		}
		return true;
	}
}
