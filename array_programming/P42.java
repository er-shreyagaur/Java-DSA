package array_programming;

import java.util.Arrays;

public class P42 {
	public static void main(String[] args) {
		int[] a = { 33, 45, 67, 82, 22, 19 };
		System.out.println(linearSearch(a));
	}

	public static int linearSearch(int[] a) {
		int target = 79;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target)
				return i;
		}
		return -1;
	}
}
