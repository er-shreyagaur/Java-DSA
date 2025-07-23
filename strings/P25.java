package strings;

import java.util.*;

public class P25 {
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printOneChar(s);
	}

	public static void printOneChar(String s) {
		int[] freq = new int[52];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90)
				freq[c - 65]++;
			else if (c >= 97 && c <= 122)
				freq[c - 97+26]++;
		}

		boolean flag = false;
		int indx = -1;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 1) {
				indx = i;
				flag = true;
				break;
			}
		}
		if (flag == true) {
			if(indx<26) {
				System.out.print((char)(indx+65));
			}
			else 
				System.out.println((char)(indx-26+97));	
		}
			
		else
			System.out.println("No such char found");
	}

}
