package recursion_programming;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int a = sc.nextInt();
		System.out.print("Enter second value: ");
		int b = sc.nextInt();
		System.out.println("LCM of the numbers is: " + getLCM(a, b));
	}

	public static int getLCM(int a, int b) {
		int hcf = (a > b) ? getHCF(a, b) : getHCF(b, a);
		int lcm = (a * b) / hcf;
		return lcm;
	}

	public static int getHCF(int a, int b) {
		if (a % b == 0)
			return b;
		return getHCF(b, a % b);
	}

}
