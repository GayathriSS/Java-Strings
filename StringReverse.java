package com.developer.Strings;

import java.util.Scanner;
/*Reverse a string.*/
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);		
		String sample = in.nextLine();
		StringReverse(sample);
	}
	public static void StringReverse(String s){
		StringBuilder m =new StringBuilder();
			for (String part: s.split(" ")){
				m.append(new StringBuilder(part).reverse().append(" ").toString());		
				}
		System.out.println(m.reverse());		
	}
}
