package array_programming;

import java.util.Arrays;

public class P19 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.print("Array after left rotation: "+Arrays.toString(rotateLeft(a)));

	}

	public static int[] rotateLeft(int[] a) {
		int n = a.length;
		int temp = a[0];
		for (int i = 1; i < n; i++) {
			a[i - 1] = a[i];
		}
		a[n - 1] = temp;
		
		return a;
	}
}
