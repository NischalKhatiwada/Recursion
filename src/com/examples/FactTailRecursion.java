package com.examples;

import java.util.Scanner;

public class FactTailRecursion {

	int factorialCalculation(int n, int factResult) {
		if (n == 1)
			return factResult;
		else
			return factorialCalculation(n - 1, n * factResult);
	}

	public static void main(String[] args) {
		int factResult = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		FactTailRecursion fact = new FactTailRecursion();
		factResult = fact.factorialCalculation(n, factResult);
		System.out.println("Factorial is " + factResult);
	}
}
