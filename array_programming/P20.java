package array_programming;

import java.util.Arrays;
import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.print("No. of rotations: ");
		int d = sc.nextInt();
		leftRotate(a, d);
		System.out.print("New Array after rotation: "+Arrays.toString(a));

	}

	public static void leftRotate(int[] a, int d) {
		d = d % a.length;
		if (d == 0)
			return;
		reverse(a, 0, a.length - 1);
		reverse(a, 0, a.length - 1 - d);
		reverse(a, a.length - d, a.length-1);

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
