package array_programming;

import java.util.Arrays;
import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.print("Enter the index: ");
		int indx = sc.nextInt();
		System.out.print("Enter the value: ");
		int value = sc.nextInt();
		System.out.print(Arrays.toString(insertElement(a, indx, value)));
	}

	public static int[] insertElement(int[] a, int indx, int value) {
		if (indx >= a.length)
			System.out.print("Index not available");
		int[] b = new int[a.length + 1];
		b[indx] = value;
		for (int i = 0; i < a.length; i++) {
			if (i < indx)
				b[i] = a[i];
			else
				b[i + 1] = a[i];
		}
		return b;
	}
}
