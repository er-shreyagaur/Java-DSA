package recursion_programming;

import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		int result = getMultiplied(a, b);
		System.out.println("Multiple is: " + result);

	}

	public static int getMultiplied(int a, int b) {
		if (b == 0)
			return 0;
	
		if (b > 0) {
			int mulFaith = getMultiplied(a, b - 1); // 9
			return mulFaith + a; // 9 + 3 (Self Work)
		} else {
			int mulFaith = getMultiplied(a, b + 1); // 9
			return mulFaith - a;
		}
	}
}
