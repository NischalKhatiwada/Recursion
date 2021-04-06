package com.examples;

import java.util.Scanner;

public class Factorial {
	int factorialCalculation(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorialCalculation(n - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		Factorial fact = new Factorial();
		int factResult = fact.factorialCalculation(n);
		System.out.println("Factorial is " + factResult);
	}
}
