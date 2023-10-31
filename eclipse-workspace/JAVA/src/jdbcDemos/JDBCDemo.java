package jdbcDemos;

import java.util.*;
import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "VIBV!*1998*");
		System.out.println("Connection Established....");
		// Statement s = con.createStatement();
		// int res=s.executeUpdate("insert into parts(pid,pname,color)
		// values(16,'Mouse','Black')");
		// System.out.println(res + " record(s) inserted..");

		// This is for normal execution of query (****IT WILL GENERATE SQL
		// INJECTION****)
		/*
		 ResultSet rs = s.
		 executeQuery("select employee_id,first_name,last_name,hire_date from employees"
		 ); // while(rs.next()) { // System.out.println("Employee ID: " +
		 rs.getInt(1)); // System.out.println("Employeee Name: " + rs.getString(2)+
		 " " + rs.getString(3)); // System.out.println("Joined Date: " +
		 rs.getDate(4)); // // System.out.println("-------------------------"); // }
		 */
		System.out.println("Enter the Employee Id to search: ");
		String empid = sc.nextLine();
		PreparedStatement ps = con.prepareStatement(
				"select employee_id,first_name,last_name,hire_date from employees where employee_id=?");

		ps.setString(1, empid);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("Employee ID: " + rs.getInt(1));
			System.out.println("Employeee Name: " + rs.getString(2) + " " + rs.getString(3));
			System.out.println("Joined Date: " + rs.getDate(4));

			System.out.println("-------------------------");
		}

		sc.close();
	}

}
