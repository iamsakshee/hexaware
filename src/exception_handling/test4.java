package exception_handling;
import java.util.Scanner;
public class test4 {

		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			System.out.println("enter product weight");
			int productWeight = s.nextInt();

			test2 test5 = new test2();
			test5.checkProudct(productWeight);
		}

	}
