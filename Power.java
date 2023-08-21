package comm.jsp.LogicalProgramming;
import java.util.Scanner;

public class Power {
		public static int power(int num, int pow){	
		    int pro=1;
			for(int i=1;i<=pow;i++) {
				pro=pro*num;
		 }
			return pro;
		}
		
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number: ");
			int num = sc.nextInt();
			System.out.println("Enter Power: ");
			int pow = sc.nextInt();
			int result = power(num,pow);
            System.out.println(num+" raise to "+pow+" is "+result);
		
	}
}
