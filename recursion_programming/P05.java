package recursion_programming;

import java.util.Scanner;

public class P05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int result = printFact(n);
		System.out.print(result);

	}

	public static int printFact(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * printFact(n - 1);
	}

}
