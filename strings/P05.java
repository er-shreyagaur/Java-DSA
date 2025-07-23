package strings;

import java.util.*;

public class P05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.print("No.of chars: " + count(s));
	}

	public static int count(String s) {
		int count = 0;
		for(char c : s.toCharArray()) {
			if(c>=97 && c<=122 || c>=65 && c<=90 || c>=48 && c<=57 || c==' ' || c>=32 && c<=126) {
				count++;
			}
		}
		return count;
	}
}
