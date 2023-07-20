package comm.jsp.LogicalProgramming;

import java.util.Scanner;

public class StrongNumber {
	public static boolean isStrong(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
		int Lastdigit =n%10;
		int fact=1;
		while(Lastdigit>0) {
			fact=fact*Lastdigit;
			Lastdigit--;
		}
	     sum=sum+fact;
	     n=n/10;
		}
		if(sum==temp) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int n =sc.nextInt();
	System.out.println(isStrong(n));
	}
}
