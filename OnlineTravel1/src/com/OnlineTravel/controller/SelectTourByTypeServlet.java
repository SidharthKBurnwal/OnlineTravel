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

@WebServlet("/SelectTourByTypeServlet")
public class SelectTourByTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SelectTourByTypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		TourDAO tdao = new TourDAO();
		ArrayList<TourInfo> tourlist = tdao.searchTourByType(type);
		
		if(tourlist.isEmpty()){
			request.setAttribute("ERRORMSG", "No Tours available by this type now.Please try other options");
			RequestDispatcher rd= request.getRequestDispatcher("SelectTourByType.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("tlist", tourlist);
			RequestDispatcher rd = request.getRequestDispatcher("TourByType.jsp");
			rd.forward(request, response);	
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
