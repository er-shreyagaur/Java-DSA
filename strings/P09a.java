package strings;
import java.util.*;
public class P09a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.print("New string: "+replaceSpace(s));
		
	}
	public static String replaceSpace(String s) {
		return s.replace(' ', '_');
	}
}
