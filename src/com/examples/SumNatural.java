package com.examples;

import java.util.Scanner;

public class SumNatural {
	int sumByRecursion(int n) {
		if (n == 1)
			return 1;
		else
			return n + sumByRecursion(n - 1);
	}

	int sumByIteration(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		SumNatural sn = new SumNatural();
		int result = sn.sumByRecursion(n);
		System.out.println("Result by Rescursion " + result);
		int sum = sn.sumByIteration(n);
		System.out.println("Result by Iteration is " + sum);
	}
}
