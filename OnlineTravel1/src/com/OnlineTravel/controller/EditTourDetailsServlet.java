package com.OnlineTravel.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.CustomerDAO;
import com.OnlineTravel.dao.TourDAO;
import com.OnlineTravel.logic.CustomerInfo;
import com.OnlineTravel.logic.TourInfo;

/**
 * Servlet implementation class EditTourDetailsServlet
 */
@WebServlet("/EditTourDetailsServlet")
public class EditTourDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EditTourDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TourInfo tourobj = new TourInfo();
		
		tourobj.setId(request.getParameter("id"));
		
		tourobj.setType(request.getParameter("type"));
		
        tourobj.setPlace(request.getParameter("place"));
		
        tourobj.setStartDate(request.getParameter("startDate"));
		
        tourobj.setEndDate(request.getParameter("endDate"));
        
        tourobj.setCost(request.getParameter("cost"));
        
        tourobj.setPassenger(request.getParameter("passenger"));
		
        TourDAO tdao = new TourDAO();
		
		//CALL DML INSERT METHOD 
		boolean f = tdao.editTourDetails(tourobj);
		response.setContentType("text/html");
		if(f)
		{
			request.setAttribute("MSG1", "TOUR DETAILS CHANGED SUCCESSFULLY");
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeAdmin.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("ERRORMSG1", "There was a problem.Please try again.");
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeAdmin.jsp");
			rd.forward(request, response);
		}
		
	}

}
