package com.javaWebAppController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.javaWebApp.Model.DataProvider;
import com.javaWebApp.been.User;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		User user = new User(userName,password);
		DataProvider dp = new DataProvider();
		User userNew = dp.readData(user);
		if(userNew != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", userNew);
			response.sendRedirect("index.jsp");
		}
		else {
			response.sendRedirect("http://localhost:8080/DemoLogin/login.jsp?error=invalidUidAndPwd");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
