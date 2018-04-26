package com.OnlineTravel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.CustomerDAO;
import com.OnlineTravel.logic.CustomerInfo;

/**
 * Servlet implementation class CustomerRegistrationServlet
 */
@WebServlet("/CustomerRegistrationServlet")
public class CustomerRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CustomerRegistrationServlet()
	{
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//CREATE OBJECT AND STORE VALUE WITHIN IT
				CustomerInfo custobj = new CustomerInfo(); 
				
				String name = request.getParameter("name");
				custobj.setName(name);
				
				String email = request.getParameter("email");
				custobj.setEmail(email);
				
				String pass = request.getParameter("password");
				custobj.setPassword(pass);
				
				String num = request.getParameter("number");
				custobj.setNumber(num);
				
				String address = request.getParameter("address");
				custobj.setAddress(address);
				
				String place = request.getParameter("place");
				custobj.setPlace(place);
				
				//CREATE OBJECT OF DAO CLASS
				CustomerDAO cdao = new CustomerDAO();
				
				boolean f = cdao.insertRecord(custobj);
				response.setContentType("text/html");
				if(f)
				{
					request.setAttribute("MSG", "CONGRATS,SIGN UP DONE.PLEASE LOG IN TO ACCESS YOUR ACCOUNT");
					RequestDispatcher rd = request.getRequestDispatcher("index2.jsp");
					rd.forward(request, response);
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
