package com.OnlineTravel.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.OnlineTravel.dao.CustomerDAO;
import com.OnlineTravel.logic.CustomerInfo;

@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CustomerLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		CustomerDAO cdao = new CustomerDAO();
		CustomerInfo cobj = cdao.loginCheck(email, pass);
		response.setContentType("text/html");
		if(cobj != null)
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("uid", email); 
			session.setAttribute("custname", cobj.getName());
			response.sendRedirect("WelcomeUser.jsp");
		}
		else
		{
			//If details are wrong go here
			request.setAttribute("ERRORMSG", "INVALID EMAIL OR PASSWORD.PLEASE SIGN UP IF YOU DON'T HAVE AN ACCOUNT ALREADY");
			RequestDispatcher rd = request.getRequestDispatcher("index2.jsp");
			rd.forward(request, response);
		}
	}

}
