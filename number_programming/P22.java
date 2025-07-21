package number_programming;

import java.util.Scanner;

public class P22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Value of a: ");
		int a = sc.nextInt();
		System.out.print("Value of b: ");
		int b = sc.nextInt();

		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("Value of a is: " + a);
		System.out.print("Value of b is: " + b);
	}

}
