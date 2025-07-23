package strings;
import java.util.*;
public class P12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.print(addDigits(s));
	}
	public static int addDigits(String s) {
		int sum = 0;
		for(char c : s.toCharArray()) {
			if(c%2==0 && c>=48 && c<= 57)
				sum = sum + c - 48;
		}
		return sum;
	}
}
