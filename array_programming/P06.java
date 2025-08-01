package array_programming;

import java.util.Scanner;
import java.util.Arrays;

public class P06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		Bigger(a);

	}

	public static void Bigger(int[] a) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + i;
			count++;
		}
		int avg = sum / count;

		int bigCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > avg) {
				System.out.println(a[i] + " ");
				bigCount++;
			}
		}
		System.out.println("Count of bigger elements: " + count);

	}
}
