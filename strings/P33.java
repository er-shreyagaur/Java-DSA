package strings;
import java.util.*;
public class P33 {
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(checkFascinating(num));
		}
	public static boolean checkFascinating(int num) {
		String str = num+""+(num*2)+""+(num*3);
		int[] freq = new int[10];
		
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			freq[c-48]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(!(freq[i]==1))
				return false;
		}
		return true;
	}
}
