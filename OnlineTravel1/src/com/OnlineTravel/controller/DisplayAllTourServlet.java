package com.OnlineTravel.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.TourDAO;
import com.OnlineTravel.logic.TourInfo;


@WebServlet("/DisplayAllTourServlet")
public class DisplayAllTourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DisplayAllTourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Create object of DAO class
		
		TourDAO tdao = new TourDAO();
		
		//CALL DAO method
		ArrayList<TourInfo> tourlist = tdao.displayAllTour();
		
		//PUT ARRAYLIST OBJECT INSIDE REQUEST OBJECT(key-Value)
		request.setAttribute("tlist", tourlist);
				
		//CREATE LINK BETWEEN SEVLET TO JSP FILE
		RequestDispatcher rd = request.getRequestDispatcher("DisplayAllTour.jsp");
				
		//FORWARD TO JSP PAGE
		rd.forward(request, response);	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
