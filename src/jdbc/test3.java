package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("driver class loaded");

		// get the connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "sakshi");

		System.out.println("i got the connection");

		String sql = "INSERT INTO detail (id, name) VALUES (?, ?)";

		// Create a PreparedStatement object
		PreparedStatement ps = connection.prepareStatement(sql);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id: ");
		int x = sc.nextInt();

		System.out.println("Enter name: ");
		String y = sc.next();

		ps.setInt(1, x);
		ps.setString(2, y);
		
		int z = ps.executeUpdate();

		System.out.println("Record inserted successfully!");
		connection.close();

	}
}