package com.examples;

import java.util.Scanner;

public class PowerRecursion {

	int power(int num, int pow) {
		if (pow == 0)
			return 1;
		else
			return num * power(num, pow - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number and its raised power");
		int num = in.nextInt();
		int pow = in.nextInt();
		PowerRecursion pr = new PowerRecursion();
		int result = pr.power(num, pow);
		System.out.println("Result is " + result);
	}

}
