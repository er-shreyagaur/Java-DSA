package array_programming;

import java.util.Arrays;

public class P25 {
	public static void main(String[] args) {
		int[] a = { 121, 345, 467, 444, 909, 123, 456, 989 };
		System.out.print(Arrays.toString(getPallindrome(a)));
	}

	public static int[] getPallindrome(int[] a) {
		int count = 0;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (checkPallindrome(a[i])) {
				a[index++] = a[i];
				count++;
			}
		}
		System.out.println("No. of Pallindrome Numbers: " + count);
		return Arrays.copyOfRange(a, 0, index);
	}

	public static boolean checkPallindrome(int i) {
		int n = i;
		int rev = 0;
		while (n > 0) {
			int num = n % 10;
			rev = rev * 10 + num;
			n = n / 10;
		}
		return rev == i;
	}
}
