package jdbcDemos;

import java.util.*;
import java.sql.*;

public class JdbcEntryApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplier", "root", "VIBV!*1998*");

			while (true) {
				System.out.println("Welcome to JDBC Entry Application :");
				System.out.println("1. Insert");
				System.out.println("2. Update");
				System.out.println("3. Delete");
				System.out.println("4. Search");
				System.out.println("5. Exit");

				System.out.println("Enter You Choice: ");
				int choice = sc.nextInt();

				if (choice == 1) {
					System.out.println("Enter the Part Id: ");
					int pid = sc.nextInt();

					System.out.println("Enter the Part Name: ");
					String pname = sc.next();

					System.out.println("Enter the Part Color: ");
					String color = sc.next();

					PreparedStatement ps = c.prepareStatement("insert into parts(pid,pname,color) values(?,?,?)");

					ps.setInt(1, pid);
					ps.setString(2, pname);
					ps.setString(3, color);

					int record = ps.executeUpdate();
					System.out.println(record + "Record Inserted");
					System.out.println("-------------------------");

				} else if (choice == 2) {
					System.out.println("Enter the Part Id to Update: ");
					int pid = sc.nextInt();

					PreparedStatement ps = c.prepareStatement("update parts set pname=?, color=? where pid=?");

					ps.setInt(3, pid);
					System.out.println("Enter Updated Value for Part Name: ");
					String pname = sc.next();
					ps.setString(1, pname);

					System.out.println("Enter Updated Value for Part Color: ");
					String color = sc.next();
					ps.setString(2, color);

					int record = ps.executeUpdate();
					System.out.println(record + "Record Updated");
					System.out.println("-------------------------");

				} else if (choice == 3) {
					System.out.println("Enter the Part ID to Delete: ");
					int pid = sc.nextInt();

					PreparedStatement ps = c.prepareStatement("delete from parts where pid=?");

					ps.setInt(1, pid);

					int record = ps.executeUpdate();
					System.out.println(record + "Record Deleted");
					System.out.println("-------------------------");

				} else if (choice == 4) {
					System.out.println("Enter the Part Id to Search:");
					int pid = sc.nextInt();

					PreparedStatement ps = c.prepareStatement("select * from parts where pid=?");

					ps.setInt(1, pid);
					ResultSet rs = ps.executeQuery();

					while (rs.next()) {
						System.out.println("Part Id: " + rs.getInt(1));
						System.out.println("Part Name: " + rs.getString(2));
						System.out.println("Color: " + rs.getString(3));

						System.out.println("-------------------------");
					}
				} else if (choice == 5) {
					System.exit(0);
				} else {
					System.out.println("Select a Valid Operation..");
					System.out.println("-------------------------");
					System.exit(0);
				}

			}
		}

	}

}
