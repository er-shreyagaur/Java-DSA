package array_programming;

import java.util.Arrays;

public class P24 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 56, 47, 21, 28, 51 };
		System.out.print(Arrays.toString(getPrime(a)));

	}

	public static int[] getPrime(int[] a) {
		int indx = 0;
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (checkPrime(a[i])) {
				a[indx++] = a[i];
				count++;
			}
		}
		System.out.println("No. of Prime Numbers: " + count);
		return Arrays.copyOfRange(a, 0, indx);
	}

	public static boolean checkPrime(int i) {
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 2)
			return true;
		return false;
	}

}
