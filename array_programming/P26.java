package array_programming;

import java.util.Arrays;

public class P26 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 2, 1, 4, 4, 3, 6, 3 };
		getFrequency(a);

	}

	public static void getFrequency(int[] a) {
		int max_element = a[0];
		int max_freq = 1;
		int[] freq = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			freq[a[i]]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] >= max_freq) {
				max_element = i;
				max_freq = freq[i];
			}
		}
		System.out.println("Max. element is: " + max_element);
		System.out.println("Max. element frequency: " + max_freq);
	}
}
