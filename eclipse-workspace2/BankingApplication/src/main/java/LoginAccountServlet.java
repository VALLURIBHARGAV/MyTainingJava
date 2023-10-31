

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginAccountServlet
 */
@WebServlet("/LoginAccountServlet")
public class LoginAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated methdoGet(request, response);
		String userId = request.getParameter("UserId");
        String password = request.getParameter("Password");
        boolean loggedIn = false;
		
		
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Connection con = null;
			 try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hollandbank", "root", "VIBV!*1998*");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			 PrintWriter out=response.getWriter();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from accountdetails where userId = ? and password = ?");
			
			ps.setString(1, userId);
            ps.setString(2, password);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                loggedIn = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		HttpSession session = request.getSession();
		if(session!=null) {
        if (loggedIn) {
        	
        	
            session.setAttribute("username", userId);
            out.println("Login successful. Welcome, " + userId + "!");
            out.println("	<a href=\"Deposit.jsp\" > <buttton> Deposit </button></a> &nbsp; &nbsp;\r\n"
            		+ "            <a href=\"Withdraw.jsp\" > <buttton> Withdraw </button></a> &nbsp; &nbsp;\r\n"
            		+ "            <a href=\"Transfer.jsp\" > <buttton> Transfer </button></a> &nbsp; &nbsp;\r\n"
            		+ "            <a href=\"Balance.jsp\" > <buttton> Check Balance </button></a> &nbsp; &nbsp;\r\n"
            		+ "\r\n"
            		+ "            <a href=\"Logout.jsp\" > <buttton> Logout </button></a>\r\n"
            		+ "");
            
        } else {
            out.println("Login failed. Please check your credentials.");
            out.println("<a href=\"LoginAccount.jsp\" > <buttton>Re-Login </button></a>");
            
        }
        System.out.println("Connection Established....");
	}
    }
}
		
	


