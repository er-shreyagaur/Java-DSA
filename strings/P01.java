package strings;
import java.util.*;
public class P01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		System.out.print("No. of chars in string: "+count(s));
	}
	public static int count(String s) {
		int count = 0;
		for(char c : s.toCharArray()) {
			count++;
		}
		return count;
	}
}
