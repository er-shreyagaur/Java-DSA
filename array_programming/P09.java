package array_programming;

import java.util.Scanner;
import java.util.Arrays;

public class P09 {
	public static void main(String[] args) {

		int[] a = { 3, 5, 1, 4, 67, 48, 29 };
		System.out.println(Arrays.toString(swapValues(a)));
	}

	public static int[] swapValues(int[] a) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;

		return a;
	}
}
