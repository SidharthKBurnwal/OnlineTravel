package com.OnlineTravel.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.OnlineTravel.dao.BookDAO;
import com.OnlineTravel.logic.BookNow;
import com.OnlineTravel.logic.TourInfo;

@WebServlet("/ViewYourBookingsServlet")
public class ViewYourBookingsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewYourBookingsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String email = request.getParameter("email");
		
		//CREATE OBJECT OF DAO CLASS
				BookDAO bdao = new BookDAO();
				
				ArrayList<BookNow> booklist = bdao.viewYourBookings(email);
				
				if(booklist.size()==0){
					request.setAttribute("ERRORMSG", "Please enter registered emailid");
					RequestDispatcher rd= request.getRequestDispatcher("WelcomeUser.jsp");
					rd.forward(request, response);
				}else{
			
					request.setAttribute("blist", booklist);
					RequestDispatcher rd = request.getRequestDispatcher("YourBookings.jsp");
					rd.forward(request, response);	
				}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
