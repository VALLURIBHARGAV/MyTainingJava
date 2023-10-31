import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		if ("ValluriBhargav".equals(username) && "Secret@123".equals(password) ) {
			//request.getSession().setAttribute("username", username);
			
			//Through Coookies
//			Cookie cookie=new Cookie("username", username);
//			response.addCookie(cookie);
			
			HttpSession session=request.getSession(true);
			session.setAttribute("user", username);
			
			out.println("Welcome " + username);
			out.println("<a href='/OnlineShopping/Product.html'> <button>Product Page </button> </a>");
		} else {
			response.sendRedirect("Error.html");
		}

		doGet(request, response);
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet Intialiazedd");
		super.init();
	}
}
