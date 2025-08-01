package array_programming;

import java.util.Arrays;
import java.util.Scanner;

public class P49 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the index: ");
		int indx = sc.nextInt();
		System.out.print("Enter the value: ");
		int value = sc.nextInt();
		int[] b = insertElement(a, indx, value);
		System.out.println("Original Array is: " + Arrays.toString(a));
		System.out.println("New Array is: " + Arrays.toString(b));
	}

	public static int[] insertElement(int[] a, int indx, int value) {
		if (indx > a.length) {
			System.out.println("Given index not available");
			return a;
		}
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
