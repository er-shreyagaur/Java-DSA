package array_programming;

import java.util.Arrays;
import java.util.Scanner;

public class P48 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index to be removed: ");
		int indx = sc.nextInt();
		int[] b = removeElement(a, indx);
		System.out.println("Original Array is: " + Arrays.toString(a));
		System.out.println("New Array is: " + Arrays.toString(b));

	}

	public static int[] removeElement(int[] a, int indx) {
		if (indx >= a.length) {
			System.out.println("Given index not available");
			return a;
		}
		int[] b = new int[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (i < indx)
				b[i] = a[i];
			else if (i > indx)
				b[i - 1] = a[i];
		}
		return b;
	}

}
