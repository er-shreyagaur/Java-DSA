package strings;
import java.util.*;
public class P29 {
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(nonRepeating(s));
	}
	public static int nonRepeating(String s) {
		int[] freq = new int[52];
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(c>=65 && c<=90)
				freq[c-65]++;
			else if(c>=97 && c<=122)
				freq[c-97+26]++;
		}
		for(int i=0; i< s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 65 && c<=90) {
				if(freq[c-65]==1)
					return i;
			}
			else if(c>= 97 && c<= 122) {
				if(freq[c-97+26]==1)
					return i;
			}
		}
		return -1;
		
	}
}
