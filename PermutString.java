package com.developer.Strings;

import java.util.Scanner;
/* Given two strings, determine if one is a permutation of the other.*/
public class PermutString {
	public static void main(String[] args) {
		System.out.println("Enter String one");
		Scanner in = new Scanner(System.in);
		String sample = in.nextLine();
		System.out.println("Enter String two");
		String sample1 = in.nextLine();
		Boolean s = StringPerm(sample, sample1);
		System.out.println(s);
	}

	public static boolean StringPerm(String sample, String sample1) {
		if (sample.length() == sample1.length()) {
			return sort(sample).equals(sort(sample1));
		} else {
			return false;
		}
	}

	public static String sort(String s) {
		char[] ch = s.toLowerCase().toCharArray();
		java.util.Arrays.sort(ch);
		return new String(ch);

	}
}
