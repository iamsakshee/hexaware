package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("driver class loaded");
		
		//get the connection 
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "sakshi");
		
		System.out.println("i got the connection");
		
		Statement statement = connection.createStatement();
		
		int x = statement.executeUpdate("insert into detail values(100,'sakshi')");
		System.out.println(x + "row(s) inserted");
		
		int y = statement.executeUpdate("insert into detail values(102,'abcd')");
		System.out.println(y + "row(s) inserted");
		
		int z = statement.executeUpdate("insert into detail values(103,'xyz')");
		System.out.println(z + "row(s) inserted");
		
		int a = statement.executeUpdate("insert into detail values(104, 'lmnop')");
		System.out.println(a + "row(s) inserted");
		
		int p = statement.executeUpdate("update detail set name = 'sakshisakshi' where id = 103");
		System.out.println(p + " Row(s) Updated");
		
		int g = statement.executeUpdate("delete from detail where id = 104");
		System.out.println(g+ " Row(s) deleted");
	

		
		//close the connection 
		connection.close();
		
	}

}