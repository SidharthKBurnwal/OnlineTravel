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

/**
 * Servlet implementation class DisplayAllTourUserServlet
 */
@WebServlet("/DisplayAllTourUserServlet")
public class DisplayAllTourUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllTourUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TourDAO tdao = new TourDAO();
		
		//CALL DAO method
		ArrayList<TourInfo> tourlist = tdao.displayAllTour();
		
		//PUT ARRAYLIST OBJECT INSIDE REQUEST OBJECT(key-Value)
		request.setAttribute("tlist", tourlist);
				
		//CREATE LINK BETWEEN SEVLET TO JSP FILE
		RequestDispatcher rd = request.getRequestDispatcher("DisplayAllTourUser.jsp");
				
		//FORWARD TO JSP PAGE
		rd.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
