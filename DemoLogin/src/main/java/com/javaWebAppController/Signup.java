package com.javaWebAppController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.javaWebApp.Model.DataProvider;
import com.javaWebApp.been.Function;
import com.javaWebApp.been.User;

/**
 * Servlet implementation class Signup
 */
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String repeatPassword = request.getParameter("repassword");
		
		DataProvider dp = new DataProvider();
		
		if(Function.emtryInputSigup(fname, lname, email, userName, password, repeatPassword) != false){
			response.sendRedirect("http://localhost:8080/DemoLogin/signup.jsp?error=emtryInput");
			return;
		}
		if(Function.invalidUid(userName) != false){
			response.sendRedirect("http://localhost:8080/DemoLogin/signup.jsp?error=invalidUid");
			return;
		}
		if(Function.invalidEmail(email) != false){
			response.sendRedirect("http://localhost:8080/DemoLogin/signup.jsp?error=invalidEmail");
			return;
		}
		if(Function.invalidPasswordMatches(password, repeatPassword) != false){
			response.sendRedirect("http://localhost:8080/DemoLogin/signup.jsps?error=invalidPasswordMatches");
			return;
		}
		if(Function.uidExists(dp, userName, email) != false){
			response.sendRedirect("http://localhost:8080/DemoLogin/signup.jsp?error=uidExists");
			return;
		}
		
		User user = new User(fname,lname,userName,email,password);
		dp.writeData(user);
		response.sendRedirect("http://localhost:8080/DemoLogin/login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
