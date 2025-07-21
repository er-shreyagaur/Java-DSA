package recursion_programming;

import java.util.Scanner;

public class P07 {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int n = sc.nextInt();
		getCount(n);
		System.out.println("The count for digit " + n + " is: " + count);

	}

	public static int getCount(int n) {
		if (n == 0)
			return 0;

		int ld = n % 10;
		count++;
		n = n / 10;
		getCount(n);
		return count;

	}

}
