package number_programming;

import java.util.*;

public class P07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print(checkPal(n));

	}

	public static boolean checkPal(int n) {
		int result = 0;
		int num = n;
		while (num > 0) {
			int ld = num % 10;
			result = (result * 10) + ld;
			num = num / 10;
		}
		if (result == n)
			return true;
		return false;
	}
}
