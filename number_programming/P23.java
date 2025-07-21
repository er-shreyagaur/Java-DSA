package number_programming;

import java.util.Scanner;

public class P23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value for b: ");
		int b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a: " + a);
		System.out.println("Value for b: " + b);

	}
}
