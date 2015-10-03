package com.developer.Strings;

import java.util.Scanner;

/*Number of unique characters in a string without additional data structure*/
public class UniqueCharnoadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);		
		String sample = in.nextLine();
		test(sample);
	}
	
	public static void test(String sample){
		StringBuilder s = new StringBuilder() ;
		
		for(int i=0;i<sample.length();i++){
		int flag=0;
		for(int j=i+1;j<sample.length();j++){
				if(sample.charAt(i) == sample.charAt(j)){
					System.out.println("Repetation "+ sample.charAt(i));
					flag =1;
				}
		}
		if(flag == 0){
		s.append(sample.charAt(i));
		}
		}
		System.out.println("Resultant String is "+s);
	}
}
