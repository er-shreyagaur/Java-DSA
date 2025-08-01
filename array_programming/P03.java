package array_programming;

import java.util.Arrays;

public class P03 {
	public static void main(String[] args) {
		int[] a = { 12, 18, 20, 15, 28, 47, 58, 69 };
		int[] b = printEven(a);
		System.out.println("New Array: " + Arrays.toString(b));

	}

	public static int[] printEven(int[] a) {
		int[] b = new int[a.length];
		int cnt = 0;
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[j++] = a[i];
				cnt++;
			}
		}
		System.out.println("Number of even elements: " + cnt);
		return b;

	}
}
