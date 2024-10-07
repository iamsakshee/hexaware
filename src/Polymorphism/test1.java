package Polymorphism;

public class test1 {
	
	public void sum(int x, int y)
	{
		System.out.println("integer sum: " + (x+y));
	}
	
	public void sum(double x, double y)
	{
		System.out.println("double sum: " + (x+y));
	}
	
	
public static void main(String[] args) {
		
		test1 obj ; 
		obj = new test1();
		
		obj.sum(45, 235);
		obj.sum(5.65, 42.5);
	}

}
