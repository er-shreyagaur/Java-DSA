package recursion_programming;
import java.util.Scanner;

public class P09 {
	static int rev = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int n = sc.nextInt();
		getReverse(n);
		System.out.println("The count for digit " + n + " is: " + rev);
	}
	public static int getReverse(int n) {
		if(n==0)
			return 0;
		int ld = n%10;
		rev = rev*10 + ld;
		n = n/10;
		getReverse(n);
		return rev;
	}
}
