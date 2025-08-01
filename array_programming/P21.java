package array_programming;

import java.util.Arrays;

public class P21 {
	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 7, 7, 5, 10, 1, 2, 11, 11 };

		int[] ans = printArray(a);
		System.out.println(Arrays.toString(printArray(ans)));
	}

	public static int[] printArray(int[] a) {
		int larg = a[0];
		int slarg = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > larg) {
				slarg = larg;
				larg = a[i];
			} else if (a[i] < larg && a[i] > slarg)
				slarg = a[i];
		}

		return new int[] { larg, slarg };
	}

}
