package com.qc.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Base {
	// instance variable
	static int a = 10;

	// static variable
	static int bb = 20;
}

public class SampleJava extends Base {

	static String b = "abc123cd3ef45";
	static char c[] = b.toCharArray();

	public static void stringReverse(String a) {
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}

	public static void swapTwoDigits(int a, int b) {
		System.out.println("Before Swap a: " + a + " and b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap a: " + a + " and b: " + b);
	}

	public static void isPrime(int n) {
		int m = n / 2;
		int count = 0;
		if (n == 0 || n == 1)
			System.out.println(n + " is not prime");
		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count > 0)
			System.out.println(n + " is not prime");
		else
			System.out.println(n + " is prime");
	}

	public static void isPalindrome(int n) {
		int onum = n;
		int rem = 0;
		int num = 0;

		while (n > 0) {
			rem = n % 10;
			num = (num * 10) + rem;
			n = n / 10;
		}
		if (onum == num) {
			System.out.println(onum + " is palindrome");
		}

		else {
			System.out.println(onum + " is not palindrome");
		}
	}

	public static void sortArray() {
		String[] strArray = { "Abhishek", "selenium", "Automation" };

		// Using Arrays class
		Arrays.sort(strArray);
		for (String a : strArray) {
			System.out.print(a + " ");
		}

		// Using ArrayList
		List<String> arr = new ArrayList<String>();
		for (String s : strArray) {
			arr.add(s);
		}
		Collections.sort(arr);
		System.out.println(arr);

	}

	public static void sortIntArray() {
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		Arrays.sort(arr);
		for (int s : arr) {
			System.out.print(s + ", ");
		}

	}

	public static void repeatedChars(String a) {
		Set<Character> st = new HashSet<Character>();
		int count = 0;
		for (char e : c) {
			st.add(e);
		}

		for (char f : st) {
			for (int i = 0; i <= c.length - 1; i++) {
				if (f == c[i]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(f + " is repeated " + count + " times.");
			}
			count = 0;
		}
	}

	void GFG() {
		// referring current class(i.e, class RR)
		// instance variable(i.e, a)
		this.a = 100;
		System.out.println(a);
		System.out.println(super.a);

		// referring current class(i.e, class RR)
		// static variable(i.e, b)
		this.bb = 600;
		System.out.println(bb);
		System.out.println(super.bb);
	}

	public static void main(String a[]) {
		// SampleJava.sortIntArray();
		SampleJava sj = new SampleJava();
		sj.GFG();

	}

}
