package strings;
import java.util.*;
public class P13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s) {
		char[] c = s.toCharArray();
		for(int i = 0; i<c.length/2; i++) {
			char temp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		return new String(c);
	}
}
