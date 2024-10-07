package exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;


public class test1 {

		public static void main(String[] args) {
			
			try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter first number");
			
			int fno = scanner.nextInt();
			
			System.out.println("enter second number");
			
			int sno = scanner.nextInt();
			
			double  division = fno/sno;
			
			System.out.println("division of given  two numbers is: " + division);
			}
			
			catch(Exception e)
			{
				if(e instanceof ArithmeticException) {
					System.out.println("don't enter zero as denominator");
				}
				else if(e instanceof InputMismatchException) {
					System.out.println("please pass only numeric values");
				}
			}
			
			finally
			{
				System.out.println("finally block gets executed always");
			}
		
			
		}
	}

