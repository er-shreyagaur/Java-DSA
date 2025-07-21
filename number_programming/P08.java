package number_programming;

import java.util.Scanner;

public class P08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (checkPal(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.print("Count is: " + count);

	}

	public static boolean checkPal(int i) {
		int result = 0;
		int num = i;
		while (num > 0) {
			int ld = num % 10;
			result = (result * 10) + ld;
			num = num / 10;
		}
		if (result == i)
			return true;
		return false;
	}

}
