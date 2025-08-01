package array_programming;

import java.util.Arrays;

public class P46 {
	public static void main(String[] args) {
		int[] a = { 0, 2, 1, 2, 6, 4 };
		System.out.print(peakIndexInMountain(a));
	}

	public static int peakIndexInMountain(int[] a) {
		int n = a.length;

		if (n == 1)
			return 0;
		if (a[0] > a[n - 1])
			return 0;
		if (a[n - 1] > a[n - 2])
			return n - 1;
		int low = 1;
		int high = a.length - 2;
		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1])
				return mid;
			else if (a[mid] > a[mid - 1])
				low = mid + 1;
			else if (a[mid] > a[mid + 1])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
