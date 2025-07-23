package strings;
import java.util.*;
public class P30 {
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(getMissing(s));
	}
	public static int getMissing(String s) {
		int[] freq = new int[s.length()+1];
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			freq[c-48]++;
		}
		for(int i=0; i<freq.length;i++) {
			if(freq[i]==0)
				return i;
			
		}
		return -1;
	}
}
