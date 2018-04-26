package com.OnlineTravel.controller;

import java.io.IOException;
import java.util.ArrayList;

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
 * Servlet implementation class FetchTourDetailsServlet
 */
@WebServlet("/FetchTourDetailsServlet")
public class FetchTourDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FetchTourDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tid = request.getParameter("id");
		TourDAO tdao = new TourDAO();
		ArrayList<TourInfo> tourlist = tdao.searchTourById(tid);
		
		if(tourlist.size()==0){
			request.setAttribute("ERRORMSG", "INVALID TourID");
			RequestDispatcher rd= request.getRequestDispatcher("WelcomeAdmin.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("tlist", tourlist);
			RequestDispatcher rd = request.getRequestDispatcher("EditTourDetails.jsp");
			rd.forward(request, response);	
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
