package com.oops_concepts;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyChar letter = new MyChar('A');
		System.out.println(letter.isVowel());
		System.out.println(letter.isConsonant());
		System.out.println(letter.isNumber());
		System.out.println(letter.isAlphabet());
		letter.printLowerCaseAlphabets();
		letter.printUpperCaseAlphabets();
	}

}
