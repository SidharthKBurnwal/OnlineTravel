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


@WebServlet("/AddTourServlet")
public class AddTourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddTourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//CREATE OBJECT OF TOURINFO CLASS AND STORE VALUE WITHIN IT
				TourInfo tourobj = new TourInfo();
				
				String id = request.getParameter("id");
				tourobj.setId(id);
				
				String type = request.getParameter("type");
				tourobj.setType(type);
				
				String place = request.getParameter("place");
				tourobj.setPlace(place);
				
				String start = request.getParameter("startDate");
				tourobj.setStartDate(start);
				
				String end = request.getParameter("endDate");
				tourobj.setEndDate(end);
				
				String cost = request.getParameter("cost");
				tourobj.setCost(cost);
				
				String passenger = request.getParameter("passenger");
				tourobj.setPassenger(passenger);
				
				//CREATE OBJECT OF DAO CLASS
				TourDAO tdao = new TourDAO();
				
				boolean f = tdao.insertTour(tourobj);
				response.setContentType("text/html");
				if(f)
				{
					//If tour details are valid go here
					request.setAttribute("MSG1", "TOUR ADDED SUCCESSFULLY");
					RequestDispatcher rd = request.getRequestDispatcher("WelcomeAdmin.jsp");
					rd.forward(request, response);
				}
				else
				{
					//If any problem arises go here
					request.setAttribute("ERRORMSG1", "There was a problem.Tour not added yet.");
					RequestDispatcher rd = request.getRequestDispatcher("WelcomeAdmin.jsp");
					rd.forward(request, response);
				}
	}

}
