package number_programming;

import java.util.Scanner;

public class P13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term: ");
		int n = sc.nextInt();
		int term = printFibo(n);
		System.out.println(term);
		
	}
	public static int printFibo(int n) {
		if(n==0 )
			return 0;
		if(n==1 )
			return 1;
		
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=2; i<=n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}
}
