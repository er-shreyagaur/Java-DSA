package array_programming;

import java.util.Scanner;
import java.util.Arrays;

public class P07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int[] result = printArray(a);
		System.out.println(Arrays.toString(result));
	}

	public static int[] printArray(int[] a) {
		int larg = a[0];
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > larg) {
				larg = a[i];
			} else {
				if (a[i] < small)
					small = a[i];
			}
		}
		int Diff = larg - small;
		System.out.println("Difference is: " + Diff);
		return new int[] { larg, small };

	}
}
