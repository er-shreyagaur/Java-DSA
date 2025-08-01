package array_programming;

import java.util.Arrays;

public class P05 {
	public static void main(String[] args) {
		int[] a = { 2, 5, 4, 37, 10 };
		SumAndAverage(a);

	}

	public static int[] SumAndAverage(int[] a) {
		int sum = 0;
		int count = 0;
		int avg = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			count++;
		}
		avg = sum / count;
		System.out.println("Sum is:" + sum);
		System.out.println("Average is: " + avg);

		return a;
	}

}
