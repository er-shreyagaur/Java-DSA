package array_programming;

import java.util.Arrays;

public class P35 {
	public static void main(String[] args) {
		int[] a = { 12, 10, 18, 15, 17, 14 };
		selectionSort(a);
	}

	public static void selectionSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int min = a[i];
			int indx = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < min) {
					min = a[j];
					indx = j;
				}
			}
			a[indx] = a[i];
			a[i] = min;
		}
		System.out.println("Selection Sorted: " + Arrays.toString(a));
	}
}
