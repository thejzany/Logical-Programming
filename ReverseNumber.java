package comm.jsp.LogicalProgramming;
import java.util.Scanner;
public class ReverseNumber {
	public static void reverseNumber(int n) {
		int rev=0;
		int temp=n;
		while(n>0) {
			int Lastdigit = n%10;
			rev = rev *10+Lastdigit;
			n=n/10;
			
		}	System.out.println("Reverse of "+temp+" is "+rev);
	}
	
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int n = sc.nextInt();
	reverseNumber(n);	
}
}