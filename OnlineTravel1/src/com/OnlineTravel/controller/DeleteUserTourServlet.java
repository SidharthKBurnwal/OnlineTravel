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
import com.OnlineTravel.dao.TourDAO;

/**
 * Servlet implementation class DeleteUserTourServlet
 */
@WebServlet("/DeleteUserTourServlet")
public class DeleteUserTourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public DeleteUserTourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			String id = request.getParameter("bookingid");
		
		//CREATE OBJECT OF DAO CLASS
				BookDAO bdao = new BookDAO();
				
				boolean f = bdao.deleteUserTour(id);
				response.setContentType("text/html");
				if(f)
				{
					request.setAttribute("MSG", "YOUR BOOKING CANCELLED SUCCESSFULLY");
					RequestDispatcher rd = request.getRequestDispatcher("WelcomeUser.jsp");
					rd.forward(request, response);
				}
				else
				{
					request.setAttribute("ERRORMSG", "INVALID BOOKING ID");
					RequestDispatcher rd = request.getRequestDispatcher("DeleteUserTour.jsp");
					rd.forward(request, response);
				}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
