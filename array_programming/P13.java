package array_programming;

import java.util.*;

public class P13 {
	public static void main(String[] args) {
		int[] a = { 10, 8, 30, 40, 30, 20, 10 };
		System.out.print(checkPalindromic(a));

	}

	public static boolean checkPalindromic(int[] a) {
		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[j])
				return false;
			j--;
		}
		return true;

	}

}
