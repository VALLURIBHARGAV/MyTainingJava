package com.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResgisterServlet
 */
@WebServlet("/ResgisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		Register  obj = new Register (userName,password,email);
		
		//jdbc Connection
		
		HttpSession session= request.getSession();
		session.setAttribute("user", userName);
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Toy", 500));
		products.add(new Product(1, "Tires", 300));
		products.add(new Product(1, "Phone", 4500));
		products.add(new Product(1, "Book", 100));
		products.add(new Product(1, "Bag", 900));
		products.add(new Product(1, "Chair", 400));
		if(session.getAttribute("users")==null) {
			HashMap<String,Register> users = new HashMap<String,Register>();
			users.put(userName, obj);
		}
		else {
			@SuppressWarnings("unchecked")
			HashMap<String,Register> users = (HashMap<String,Register>)session.getAttribute("users");
			users.put(userName, obj);
		}
		response.sendRedirect("ProductList.jsp"); 
		
	}

}
