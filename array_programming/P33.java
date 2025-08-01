package array_programming;

import java.util.Arrays;
import java.util.HashMap;

public class P33 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 4, 2 };
		int sum = uniqueSum(a);
		System.out.println("Sum of Unique Elements: " + sum);
	}

	public static int uniqueSum(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : a) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int sum = 0;

		for (int num : map.keySet()) {
			if (map.get(num) == 1) {
				sum += num;
			}
		}
		return sum;
	}
}
