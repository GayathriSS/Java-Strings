package com.goingtoget;

public class ReverseWord {

	public static void main(String[] args) {
		
		StringBuilder input = new StringBuilder();
		input.append("Hello");
		input.append("\n");
		input.append("this is new");
		input.append("\n");
		input.append("you");
		int j = 0;
		StringBuilder s =  new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			
			if (input.charAt(i) == ' ') {
					s.append(input.reverse().substring(j, i));
					j = i + 1;
				}
			else if(input.charAt(i) == '\n'){
				System.out.println(s);
			}
			else{
				s.append(input.charAt(i));
			}
		}
		//System.out.println(s.reverse());
	}
}
