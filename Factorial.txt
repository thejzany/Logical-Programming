package comm.jsp.LogicalProgramming;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int n) {
		int fact = 1;
	for(int i=1;i<=n;i++) {
		fact = fact*i;
	}
			return fact;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a Number: ");
	    int n =sc.nextInt();
	    int res = factorial(n);
	    System.out.println("Factorial of "+n+" is "+res);
	}
}
