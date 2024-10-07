package Encapsulation;

public class test1 {
	public static void main(String[] args) {
		
		student student = new student();
		
	   student.setStid(100);
	   student.setStname("sakshi");
	   System.out.println("student id is: " + student.getStid());
	   System.out.println("student name is: " + student.getStname());
	}
}
