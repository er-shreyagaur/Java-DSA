package array_programming;

import java.util.Arrays;

public class P04 {
	public static void main(String[] args) {
		int[] a = { 124, 18, 280, 105, 2738, 447, 58, 61739 };
		int cnt = 0;
		for (int x : a) {
			int digitCount = getDigits(x);
			if (digitCount == 3) {
				System.out.println(x);
				cnt++;
			}
		}
		System.out.println("No. of three digits in array: " + cnt);
	}

	public static int getDigits(int n) {
		int count = 0;
		while (n > 0) {
			int ld = n % 10;
			count++;
			n = n / 10;
		}
		return count;

	}

}
