package strings;
import java.util.*;
public class P09b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.print("Result string: "+replaceSpace(s));
	}
	public static String replaceSpace(String s) {
		String res = " ";
		for(char c: s.toCharArray()) {
			if(c != ' ') 
				res = res + c;
			else 
				 res = res+'_';
		}
		return res;
	}
}
