package com.developer.Strings;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* Determine if string has all unique characters.*/
public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);
		String sample = in.nextLine();
		Set <Character> test =new TreeSet <Character>();		
		
		for(int i=0;i<sample.length();i++){
			if(!test.add(sample.charAt(i))){
				System.out.println("Repetation "+sample.charAt(i));
			}
			
		}
		System.out.println("Test is"+test);
			
		
		
		
	}

}
