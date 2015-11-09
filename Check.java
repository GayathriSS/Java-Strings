package com.developer.Strings;

import java.util.Scanner;

/*If there is a * remove the char before and after*/
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StringBuilder st = new StringBuilder();
		removechar(s, st);
	}

	public static void removechar(String s, StringBuilder st) {
		String result = s;
		int index = result.indexOf("*");
		while (index > -1) {
			if (index == 0) {
				result = result.substring(index + 2);
			}
			else if (index == result.length()-1) {
				result = result.substring(0, index - 1);
			} else {
				result = result.substring(0, index - 1)
						+ result.substring(index + 2);
			}
			index = result.indexOf('*');
		}
		System.out.println(result);
	}

}
