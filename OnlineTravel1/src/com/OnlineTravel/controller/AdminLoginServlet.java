package com.OnlineTravel.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.CustomerDAO;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		CustomerDAO cdao = new CustomerDAO();
		boolean f = cdao.adminLoginCheck(email, pass);
		response.setContentType("text/html");
		if(f)
		{
			//If admin details are right go here
			response.sendRedirect("WelcomeAdmin.jsp");
		}
		else
		{
			//If admin details are wrong go here
			request.setAttribute("ERRORMSG1", "HELLO ADMIN.YOUR CREDENTIALS ARE INVALID");
			RequestDispatcher rd = request.getRequestDispatcher("index2.jsp");
			rd.forward(request, response);
		}
	}

}
