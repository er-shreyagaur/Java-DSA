package array_programming;

import java.util.Arrays;

public class P51 {
	public static void main(String[] args) {
		int[] a = { 15, 20, 23, 38, 40, 45 };
		System.out.println(binarySearch1(a, 0, 5, 40));
	}

	public static int binarySearch1(int[] a, int low, int high, int target) {
		int mid = low + (high - low) / 2;

		if (low > high)
			return -1;
		if (a[mid] == target)
			return mid;
		else if (a[mid] > target)
			return binarySearch1(a, low, mid - 1, target);
		else
			return binarySearch1(a, mid + 1, high, target);
	}
}
