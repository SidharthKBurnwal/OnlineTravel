package com.OnlineTravel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.TourDAO;
import com.OnlineTravel.logic.TourInfo;

/**
 * Servlet implementation class DeleteTourServlet
 */
@WebServlet("/DeleteTourServlet")
public class DeleteTourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteTourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		//CREATE OBJECT OF DAO CLASS
				TourDAO tdao = new TourDAO();
				
				boolean f = tdao.deleteTour(id);
				response.setContentType("text/html");
				if(f)
				{
					request.setAttribute("MSG1", "TOUR DELETED");
					RequestDispatcher rd = request.getRequestDispatcher("WelcomeAdmin.jsp");
					rd.forward(request, response);
				}
				else
				{
					request.setAttribute("ERRORMSG", "INVALID TOURID.PLEASE TRY AGAIN");
					RequestDispatcher rd = request.getRequestDispatcher("DeleteTour.jsp");
					rd.forward(request, response);
				}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
