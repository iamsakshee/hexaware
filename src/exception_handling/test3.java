package exception_handling;
import java.util.Scanner;

public class test3 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter product weight");
		int productWeight = s.nextInt();

		test2 obj = new test2();
		obj.checkProudct(productWeight);
	}

}
