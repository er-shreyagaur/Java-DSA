package strings;
import java.util.*;
public class P32 {
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(checkPanagram(s));
	}
	public static boolean checkPanagram(String s) {
		if(s.length()<26)
			return false;
		int[] freq = getFrequency(s);
		for(int i=0; i<freq.length;i++) {
			if(freq[i]<1) {
				return false;
			}
		}
		return true;
		
	}
	public static int[] getFrequency(String s) {
		int[] freq = new int[26];
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>=97 && c<=122)
				freq[c-97]++;
		}
		return freq;
	}
}
