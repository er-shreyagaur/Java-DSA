package strings;
import java.util.*;
public class P14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.print(reversePallindrome(s));
	}
	public static boolean reversePallindrome(String s) {
		char[] c = s.toCharArray();
		for(int i=0; i<c.length/2;i++) {
			char temp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		String rev = new String(c);
		System.out.println(rev);
		
		for(int i=0; i<rev.length()/2;i++) {
			char chr = rev.charAt(i);
			if(chr!=rev.charAt(c.length-1-i))
				return false;
		}
		return true;
	}

}
