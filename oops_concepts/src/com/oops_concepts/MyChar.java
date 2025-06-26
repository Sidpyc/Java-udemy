package com.oops_concepts;

public class MyChar {

	private char letter;

	public MyChar(char letter) {
		this.letter = letter;
	}

	public boolean isVowel() {
		char lower = Character.toLowerCase(letter);
		// TODO Auto-generated method stub
		if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
			return true;
		}
		return false;

	}

	public boolean isNumber() {
		// TODO Auto-generated method stub
		int number = (int) letter;
		return number >= 0 && number <= 9;

	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		int number = (int) letter;
		return number >= 65 && number <= 90 || number >= 97 && number <= 122;

	}

	public void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub
		if (isAlphabet() && !Character.isLowerCase(letter))
			System.out.println(Character.toLowerCase(letter));

		else
			System.out.println("Already in Lower Case");

	}

	public void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
		if (isAlphabet() && !Character.isUpperCase(letter))
			System.out.println(Character.toUpperCase(letter));
		else
			System.out.println("Already in Upper Case");

	}

	public boolean isConsonant() {
		// TODO Auto-generated method stub
		return isAlphabet() && !isVowel();
	}

}
