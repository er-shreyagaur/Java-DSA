package recursion_programming;

import java.util.Scanner;

public class P06 {
	static int product = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print("Enter power: ");
		int pow = sc.nextInt();
		calPower(n, pow);
		System.out.print("The power of " + n + " is: " + product);
	}

	public static int calPower(int n, int pow) {
		if (pow == 0)
			return 1;

		product = product * n;
		calPower(n, pow - 1);
		return product;
	}

}
