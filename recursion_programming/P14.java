package recursion_programming;

import java.util.Scanner;

public class P14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a:");
		int a = sc.nextInt();
		System.out.print("Enter value of b:");
		int b = sc.nextInt();
		System.out.print("Enter value of c:");
		int c = sc.nextInt();
		int result = printHCF(a, b);
		int HCF = printHCF(c, result);
		System.out.println("The HCF of numbers: " + HCF);

	}

	public static int printHCF(int a, int b) {
		if (a % b == 0)
			return b;
		return printHCF(b, a % b);
	}
}
