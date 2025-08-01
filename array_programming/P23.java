package array_programming;

import java.util.Arrays;

public class P23 {
	public static void main(String[] args) {
		int[] a = { 18, 40, 15, 25, 23, 25, 20 };
		System.out.println("Maximum Product: " + maxProduct(a));
	}

	public static int maxProduct(int[] a) {
		int larg = a[0];
		int Slarg = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > larg) {
				Slarg = larg;
				larg = a[i];
			} else if (a[i] < larg && a[i] >= Slarg) {
				Slarg = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == larg)
				count++;
		}

		if (count > 1) {
			return larg * larg;
		}
		return larg * Slarg;
	}
}
