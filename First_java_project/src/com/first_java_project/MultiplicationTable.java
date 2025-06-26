package com.first_java_project;

public class MultiplicationTable {
	void tablePrint(int number, int start, int end) {
		System.out.println("Multiplication Table of " + number);
		for (int i = start; i <= end; i++) {
			System.out.printf("%d x %d = %d", i, number, i * number).println();
		}
	}

	void tablePrint(int number) {
		tablePrint(number, 2, 10);
	}

	void tablePrint() {
		tablePrint(5);
	}

}
