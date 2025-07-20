package number_programming;

import java.util.Scanner;

public class P01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.print(checkArm(n));

	}

	public static boolean checkArm(int n) {
		int num = n;
		int result = 0;
		while (num > 0) {
			int lastdigit = num % 10;
			result = result + (lastdigit * lastdigit * lastdigit);
			num = num / 10;
		}

		if (result == n)
			return true;
		else
			return false;
	}

}
