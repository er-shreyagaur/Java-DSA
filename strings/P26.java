package strings;

import java.util.Scanner;

public class P26 {
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printMaxChar(s);

	}
	public static void printMaxChar(String s) {
		int[] freq = new int[26];
		for(int i = 0; i< s.length();i++) {
			char c = s.charAt(i);
			if(c>=65 && c<=90)
				freq[c - 65]++;
			else if(c >= 97 && c <= 122)
				freq[c-97]++;
		}
		int max = 0;
		int maxIndx = -1;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > max) {
				max = freq[i];
				maxIndx = i;
			}
		}
		if(maxIndx != -1)
			System.out.println((char)(maxIndx+97));
		else
			System.out.println("No such char");
	}
}
