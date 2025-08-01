package array_programming;

import java.util.Scanner;
import java.util.Arrays;

public class P47 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 4, 5, 6, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rotations: ");
		int d = sc.nextInt();
		leftRotate(a, d);
		System.out.println(Arrays.toString(a));
		System.out.print(search(a, 2));

	}

	public static void leftRotate(int[] a, int d) {
		d = d % a.length;
		if (d == 0)
			return;
		reverse(a, 0, a.length - 1);
		reverse(a, 0, a.length - 1 - d);
		reverse(a, a.length - d, a.length - 1);
	}

	public static void reverse(int[] a, int start, int end) {
		while (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static int search(int[] nums, int target) {
		return search(nums, 0, nums.length - 1, target);
	}

	public static int search(int[] nums, int low, int high, int target) {
		if (low > high)
			return -1;

		int mid = low + (high - low) / 2;

		if (nums[mid] == target)
			return mid;

		if (nums[low] <= nums[mid]) {
			if (target >= nums[low] && target <= nums[mid])
				return search(nums, low, mid - 1, target);

			else
				return search(nums, mid + 1, high, target);

		} else {
			if (target >= nums[mid] && target <= nums[high])
				return search(nums, mid + 1, high, target);

			else
				return search(nums, low, mid - 1, target);

		}
	}
}
