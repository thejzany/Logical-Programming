package comm.jsp.LogicalProgramming;

import java.util.Scanner;

public class XylemPhloemNumber {
  public static String xylemPhloem(int n) {
	  int count1=0; int count2=0;
	  int sum1=0; int sum2=0;
	  int temp=n;
	  while(temp>0) {
		  temp=temp/10;
		  count1++;
	  }
	  while(n>0) {
		  int Lastdigit=n%10;
		  count2++;
		  if(count2==1 || count2==count1) {
			  sum1=sum1+Lastdigit;
		  }else {
			  sum2=sum2+Lastdigit;
		  }n=n/10;
	  }
	  if(sum1==sum2) {
		  return "it is Xylem";
	  }else {
		  return "It is Phloem";
	  }
  }
  public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n =sc.nextInt();
		System.out.println(xylemPhloem(n));
}
}
