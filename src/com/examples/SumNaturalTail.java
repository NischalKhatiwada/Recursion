package com.examples;

import java.util.Scanner;

public class SumNaturalTail {
	int sum(int n, int result) {
		if (n == 0)
			return result;
		else
			return sum(n - 1, result + n);

	}

	public static void main(String[] args) {
		int result = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		SumNaturalTail sn = new SumNaturalTail();
		result = sn.sum(n, result);
		System.out.println("Result by Tail Rescursion " + result);
	}
}
