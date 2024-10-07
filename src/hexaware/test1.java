package hexaware;

public class test1 {
 int id;
 String name;

 // Constructor to initialize values
 public test1(int id, String name) {
     this.id = id;
     this.name = name;
 }

 public static void main(String[] args) {
     // Creating an object and passing values via constructor
     test1 s1 = new test1(1, "WXYZ");
     
     // Printing the values
     System.out.println("Student ID: " + s1.id);
     System.out.println("Student Name: " + s1.name);
 }
}
