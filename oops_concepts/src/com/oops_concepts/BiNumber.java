package com.oops_concepts;

public class BiNumber {

	private int a;
	private int b;

	BiNumber(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int getNumber1() {
		return a;
	}

	int getNumber2() {
		return b;
	}

	int add() {
		return getNumber1() + getNumber2();
	}

	int multiply() {
		return getNumber1() * getNumber2();
	}

	void doubleValue() {
		this.a = 2 * this.a;
		this.b = 2 * this.b;
	}

}
