package com.OnlineTravel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.BookDAO;


@WebServlet("/PaymentUpdateServlet")
public class PaymentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PaymentUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("bookingid");
		
		
		//CREATE OBJECT OF DAO CLASS
		BookDAO bdao = new BookDAO();
		
		boolean f = bdao.updatePayment(id);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(f)
		{
			response.sendRedirect("WelcomeAdmin.jsp");
		}
		else
		{
			request.setAttribute("ERRORMSG", "SOMETHING WENT WRONG.PLEASE TRY AGAIN");
			RequestDispatcher rd = request.getRequestDispatcher("PaymentUpdate.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
