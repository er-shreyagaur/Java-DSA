package array_programming;

public class P50 {
	public static void main(String[] args) {
		int[] a = { 15, 20, 23, 38, 40, 45 };
		System.out.println(binarySearch(a, 20));

	}

	public static int binarySearch(int[] a, int target) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == target)
				return mid;
			else if (a[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
