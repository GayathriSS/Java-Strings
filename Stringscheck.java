package com.goingtoget;
/*You are given 2 documents. We want to know how similar they are through N-Grams. 

Given an input n (n = number of word in the Ngram) and two documents(strings) find the intersection of the NGrams of two document. 

E.g doc1 = 'This is a dog' 
doc2 = 'This is a cat' 
n = 3 
Ngrams for doc1 = 'This is a', 'is a dog' 
Ngrams for doc2 = 'This is a', 'is a cat' 

Output 'This is a' 

Find a efficient way and give its complexity. */
public class Stringscheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a dog";
		String s1= "This is a cat";
		compare(s,s1);
		

	}
	public static void compare(String a,String b){
	StringBuilder n = new StringBuilder();
	int i=0,j=0;
	while(a.charAt(i)==b.charAt(i)){
		System.out.print(a.charAt(i));
		if(a.charAt(i)==' '){
			j++;
		}
		i++;
	}
	System.out.println(j);
	}	
}
