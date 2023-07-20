package comm.jsp.LogicalProgramming;
import java.util.Scanner;

public class Swap1 {

	public static void swapTwoNumbers(int x, int y){
		int temp =x;
		x=y;
		y=temp;
		System.out.println("Numbers After Swapping Are");
		System.out.println("a="+x+" "+"b="+y);
	}
	
	public static void main(String [] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a =");
		a = sc.nextInt();
		System.out.println("Enter b =");
		b = sc.nextInt();
		
		swapTwoNumbers(a,b);
	}
}
