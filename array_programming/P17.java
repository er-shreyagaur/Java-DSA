package array_programming;

import java.util.Arrays;
import java.util.Scanner;

public class P17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("Enter the position: ");
		int d = sc.nextInt();
		rightRotate(a, d);
		System.out.print(Arrays.toString(a));
	}

	public static void rightRotate(int[] a, int d) {
		d = d % a.length;
		if (d == 0)
			return;
		reverse(a, 0, a.length - 1);
		reverse(a, 0, d - 1);
		reverse(a, d, a.length - 1);
	}

	public static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

}
