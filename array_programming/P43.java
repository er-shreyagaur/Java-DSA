package array_programming;

import java.util.Arrays;

public class P43 {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 2, 3, 3 };
		System.out.println(Arrays.toString(getArray(a)));
	}

	public static int[] getArray(int[] a) {
		int i = 0;
		for (int j = i + 1; j < a.length; j++) {
			if (a[j] != a[i]) {
				a[i + 1] = a[j];
				i++;
			}
		}
		return Arrays.copyOfRange(a, 0, i + 1);

	}
}
//Arrays.copyOfRange(a, 0, i + 1);  ----> This method is used create copy of the 
//										array which contains all the unique elements.