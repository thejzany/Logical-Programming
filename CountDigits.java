package comm.jsp.LogicalProgramming;
import java.util.Scanner;

public class CountDigits {
public static int countDigits(int n) {
      int count=0;
      for(int i=1;n>0;i++) {
	   count++;
       n=n/10;
      }
      return count;
}
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int n =sc.nextInt();
	int res=countDigits(n);
	System.out.println("There are "+res+" Digits"+" in "+n);
}
}
