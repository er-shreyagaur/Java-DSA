package number_programming;

import java.util.Scanner;

public class P09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (primePalindrome(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.print("Count is: " + count);

	}

	public static boolean primePalindrome(int i) {
		int count = 0;
		int result = 0;
		int num = i;
		while (num > 0) {
			int ld = num % 10;
			result = (result * 10) + ld;
			num = num / 10;
		}
		for (int j = 1; j <= i; j++) {
			if (i % j == 0)
				count++;
		}
		if (result == i && count == 2)
			return true;
		return false;
	}

}
