package comm.jsp.LogicalProgramming;
import java.util.Scanner;

public class Swap2 {


		public static void swapTwoNumbers(int x, int y){	
			x=x+y;    
			y=x-y;    
			x=x-y;    
	
			System.out.println("Numbers After Swapping Are: ");
			System.out.println("a="+x+" "+"b="+y);
		}
		
		public static void main(String [] args) {
			int a, b;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a: ");
			a = scan.nextInt();
			System.out.println("Enter b: ");
			b = scan.nextInt();
			
			swapTwoNumbers(a,b);

}
}
