

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoProject
 */
@WebServlet("/DemoProject")
public class DemoProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello World</h1>");
		out.println("<p> Welcome to Your Home Page </p> ");
		out.close();
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        // Get parameter values from the request
		
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform some processing, e.g., validate credentials
        boolean isValidUser = validateCredentials(username, password);

        // Send a response back to the client
        if (isValidUser) {
            response.getWriter().println("Login successful!" + username);
        } else {
            response.getWriter().println("Invalid credentials. Please try again.");
            out.println("<a href=/SampleWebProject/DemoProject> Click to Re-login</a>");
        }
        
        doGet(request, response);
    }

    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
    	System.out.println("Servlet Intialiazedd");
		super.init();
	}

	private boolean validateCredentials(String username, String password) {
        // Perform validation logic here (e.g., check against a database)
        // For simplicity, let's assume a hardcoded valid username and password
        return "admin".equals(username) && "secret".equals(password);
        
    }
	
	
	
	

}
