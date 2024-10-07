package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	System.out.println("driver class loaded");
	
	//get the connection 
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "sakshi");
	
	System.out.println("i got the connection");
	
	Statement statement = connection.createStatement();
	
	ResultSet rs = statement.executeQuery("select * from detail");
	
	while(rs.next())
	{
		System.out.println(rs.getInt(1) + " "+ rs.getString(2));
	}
	
	
	connection.close();
	}
}
