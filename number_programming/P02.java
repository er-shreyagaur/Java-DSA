package number_programming;

import java.util.Scanner;

public class P02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (checkArm(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.print("Count is: " + count);
	}

	public static boolean checkArm(int i) {
		int num = i;
		int result = 0;
		while (num > 0) {
			int lastdigit = num % 10;
			result = result + (lastdigit * lastdigit * lastdigit);
			num = num / 10;
		}

		if (result == i)
			return true;
		else
			return false;
	}
}
