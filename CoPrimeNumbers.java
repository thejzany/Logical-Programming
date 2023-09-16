package com.jsp.logicalprogramming;

import java.util.Scanner;

public class CoPrime {
	public static int greatestCommonDivisor(int num1, int num2) {
		int gcd = 1;

		for (int i = 1; i <= num1 && i <= num2; i++) {

			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();

		if (greatestCommonDivisor(a, b) == 1) {
			System.out.println(a + " & " + b + " are Co Prime Numbers");
		} else {
			System.out.println(a + " & " + b + " not Co Prime Numbers");
		}

	}

}
