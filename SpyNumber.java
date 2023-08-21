package comm.jsp.LogicalProgramming;

import java.util.Scanner;

public class SpyNumber {
	public static boolean isSpy(int n) {
		int sum=0;
		int pro=1;
		while(n>0) {
			int Lastdigit = n%10;
			sum=sum+Lastdigit;
			pro=pro*Lastdigit;
			n=n/10;
		}
		if(sum==pro) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int n =sc.nextInt();
	System.out.println(isSpy(n));
}
}
