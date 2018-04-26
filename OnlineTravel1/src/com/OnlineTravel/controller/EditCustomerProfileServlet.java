package com.OnlineTravel.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.CustomerDAO;
import com.OnlineTravel.logic.CustomerInfo;


@WebServlet("/EditCustomerProfileServlet")
public class EditCustomerProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EditCustomerProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		CustomerInfo custobj = new CustomerInfo();
		
		custobj.setName(request.getParameter("name"));
		
		custobj.setEmail(request.getParameter("email"));
		
        custobj.setPassword(request.getParameter("password"));
		
        custobj.setNumber(request.getParameter("number"));
		
        custobj.setAddress(request.getParameter("address"));
        
        custobj.setPlace(request.getParameter("place"));
		
        CustomerDAO cdao = new CustomerDAO();
		
		//CALL DML INSERT METHOD 
		boolean f = cdao.editProfile(custobj);
		response.setContentType("text/html");
		if(f)
		{
			request.setAttribute("MSG", "DETAILS CHANGED SUCCESSFULLY");
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeUser.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("ERRORMSG", "There was a problem.Please try again.");
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeUser.jsp");
			rd.forward(request, response);
		}
		
	}
	}
