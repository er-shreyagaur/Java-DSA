package strings;
import java.util.*;
public class P31 {
	public static void main(String[] args) {
		System.out.print("Enter first String: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.print("Enter second String: ");
		String s2 = sc.nextLine();
		System.out.print(isAnagram(s1,s2));
	}
	public static int[] getFrequency(String s) {
		int[] freq = new int[26];
		for(int i =0; i< s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 65 && c<= 90)
				freq[c-65]++;
			else if(c>=97 && c<= 122)
				freq[c-97]++;
		}
		return freq;
	}
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		int [] freq1 = getFrequency(s1);
		int [] freq2 = getFrequency(s2);
		for(int i=0; i<freq1.length; i++) {
			if(freq1[i] != freq2[i])
				return false;
		}
		return true;
	}
}
