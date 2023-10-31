
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//String username = (String) request.getSession().getAttribute("username");
		String user=null;
//		Cookie[] cookies=request.getCookies();
//		for(Cookie c: cookies) {
//			if(c.getName().equals("username"))
//				user=c.getValue();
//		}
		
		HttpSession session=request.getSession();
		if(session==null) {
			response.sendRedirect("/OnlineShopping/Login.html");
		}
		else if(session.getAttribute("user")==null) {
				out.println("Not logged in <a href='/OnlineShopping/Login.html'> <button> Login </button></a>");
				out.println("<p align='right'><a href='/OnlineShoping/LogoutServlet'> <button> Logout </button></a></p>");
		}
		else {
			user=session.getAttribute("user").toString();
			out.println("currently logged in as " +user);
		}
		//out.println("currently logged in user " +user);
		response.setContentType("text/html");
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "	<meta charset=\"ISO-8859-1\">\r\n"
				+ "	<title>Confirm Page</title>\r\n"
				+ "	<style>\r\n"
				+ "		body {\r\n"
				+ "			font-family: Arial, sans-serif;\r\n"
				+ "			background-color: #f4f4f4;\r\n"
				+ "			margin: 0;\r\n"
				+ "			padding: 0;\r\n"
				+ "			text-align: center;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		center {\r\n"
				+ "			margin-top: 50px;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		h2 {\r\n"
				+ "			color: #4CAF50;\r\n"
				+ "			/* Green color for success message */\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		p {\r\n"
				+ "			color: #333;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		button {\r\n"
				+ "            background-color: #4caf50;\r\n"
				+ "            color: white;\r\n"
				+ "            padding: 10px 20px;\r\n"
				+ "            border: none;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "            text-align: center;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "            display: inline-block;\r\n"
				+ "            font-size: 16px;\r\n"
				+ "            margin: 4px 2px;\r\n"
				+ "            cursor: pointer;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        button:hover {\r\n"
				+ "            background-color: #45a049;\r\n"
				+ "        }\r\n"
				+ "		\r\n"
				+ "	</style>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "	<center>\r\n"
				+ "		<h2>Order Placed Successfully</h2>\r\n"
				+ "		<p>Thank you, "+ user + ", for your purchase!</p><br>\r\n"
				+ "		<a href=\"/OnlineShopping/Login.html\"><button>Re-Login</button></a> &nbsp; &nbsp; \r\n"
				+ "		<a href=\"/OnlineShopping/Product.html\"><button>Product Page</button></a>\r\n"
				+ "		\r\n"
				+ "	</center>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");
		
		doGet(request, response);
	}

}
