package com.OnlineTravel.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.BookDAO;
import com.OnlineTravel.logic.BookNow;

@WebServlet("/TourDetailsServlet")
public class TourDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TourDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	     String tid = request.getParameter("tourid");
		
		//CREATE OBJECT OF DAO CLASS
				BookDAO bdao = new BookDAO();
				
				ArrayList<BookNow> booklist = bdao.viewTourDetails(tid);
				
				if(booklist.size()==0){
					request.setAttribute("ERRORMSG", "No registrations yet");
					RequestDispatcher rd= request.getRequestDispatcher("WelcomeAdmin.jsp");
					rd.forward(request, response);
				}else{
			
					request.setAttribute("blist", booklist);
					RequestDispatcher rd = request.getRequestDispatcher("ViewTourDetails.jsp");
					rd.forward(request, response);	
				}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
