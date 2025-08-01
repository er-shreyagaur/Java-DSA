package array_programming;

import java.util.Arrays;

public class P34 {
	public static void main(String[] args) {
		int[] a = { 20, 50, 40, 10, 30 };
		bubbleSort(a);
	}

	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int count = 0;
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					count++;
				}
			}
			if (count == 0)
				break;

		}
		System.out.println("Sorted Array: " + Arrays.toString(a));
	}
}
