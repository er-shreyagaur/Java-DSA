package strings;
import java.util.*;
public class P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String: ");
		String s = sc.nextLine();
		System.out.print(checkPall(s));
	}
	public static boolean checkPall(String s) {
		for(int i = 0; i<s.length()/2; i++) {
			char c = s.charAt(i);
			if(c!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
}
