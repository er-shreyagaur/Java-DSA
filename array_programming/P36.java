package array_programming;

import java.util.Arrays;

public class P36 {
	public static void main(String[] args) {
		int[] a = { 20, 12, 30, 8, 16, 18 };
		insertionSort(a);

	}

	public static void insertionSort(int[] a) {
		for(int i =1; i<a.length; i++) {
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = key;
		}
		System.out.println("Insertion Sorted: " + Arrays.toString(a));
	}
}
