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
 * Servlet implementation class SelectTourByPlaceServlet
 */
@WebServlet("/SelectTourByPlaceServlet")
public class SelectTourByPlaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SelectTourByPlaceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String place = request.getParameter("place");
		System.out.println(place);
		TourDAO tdao = new TourDAO();
		ArrayList<TourInfo> tourlist = tdao.searchTourByPlace(place);
		
		if(tourlist.isEmpty()){
			request.setAttribute("ERRORMSG", "No Tours available by this name now.Please try other new places.");
			RequestDispatcher rd= request.getRequestDispatcher("SelectTourByPlace.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("tlist", tourlist);
			RequestDispatcher rd = request.getRequestDispatcher("TourByPlace.jsp");
			rd.forward(request, response);	
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
