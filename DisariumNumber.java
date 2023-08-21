package comm.jsp.LogicalProgramming;

import java.util.Scanner;

public class DisariumNumber {
	public static boolean isDisarium(int n) {
		int count=0;
		int sum=0;
		int temp=n;
		while(temp>0){
			temp=temp/10;
			count++;
		}
		temp=n;
		while(n>0) {
			int Lastdigit=n%10;
			int pro=1;
			for(int i=1; i<=count;i++) {
				pro=pro*Lastdigit;
				}count--;
			sum=sum+pro;
			n=n/10;                                                                                     
		}if(sum==temp) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n =sc.nextInt();
		System.out.println(isDisarium(n));
}
}
