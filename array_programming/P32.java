package array_programming;

import java.util.Arrays;

public class P32 {
	public static void main(String[] args) {
		int[] a = { 4, 1, 2, 4, 3, 1, 2 };
		System.out.println(singleNumber(a));

	}

	public static int singleNumber(int[] a) {
		int value = 0;
		for (int i = 0; i < a.length; i++) {
			value = value ^ a[i];
		}
		return value;
	}
}
