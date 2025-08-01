package array_programming;

import java.util.Arrays;

public class P16 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("Array after right rotation: " + Arrays.toString(rotateRight(a)));
	}

	public static int[] rotateRight(int[] a) {
		int n = a.length;
		int temp = a[n - 1];
		for (int i = n - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = temp;
		return a;
	}
}
