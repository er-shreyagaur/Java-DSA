package array_programming;

import java.util.Scanner;
import java.util.Arrays;

public class P14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.print("Enter the index: ");
		int indx = sc.nextInt();
		System.out.print(Arrays.toString(removeElement(a, indx)));

	}

	public static int[] removeElement(int[] a, int indx) {
		if (indx >= a.length)
			System.out.print("Not available");

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
