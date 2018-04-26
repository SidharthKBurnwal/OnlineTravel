 package com.OnlineTravel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.BookDAO;
import com.OnlineTravel.dao.CustomerDAO;
import com.OnlineTravel.dao.TourDAO;
import com.OnlineTravel.logic.BookNow;
import com.OnlineTravel.logic.CustomerInfo;

@WebServlet("/BookNowServlet")
public class BookNowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public BookNowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookNow bobj = new BookNow();
		BookNow bobj1 = new BookNow();
		
		String bid = request.getParameter("bookingid");
		String tid = request.getParameter("tourid");
		String email = request.getParameter("email");
		String room = request.getParameter("room");
		String food = request.getParameter("food");
		
		
		bobj.setBookingid(bid);
		bobj.setTourid(tid);
		bobj.setEmail(email);
		bobj.setRoom(room);
		bobj.setFood(food);
		bobj.setPayment("F");
		
		bobj1.setBookingid(bid);
		bobj1.setTourid(tid);
		bobj1.setEmail(email);
		bobj1.setRoom(room);
		bobj1.setFood(food);
		bobj1.setPayment("F");

		
		String n1 = request.getParameter("name1");
		bobj.setName(n1);
		
		String a1 = request.getParameter("age1");
		bobj.setAge(a1);
		
		String g1 = request.getParameter("gender1");
		bobj.setGender(g1);
		
		String n2 = request.getParameter("name2");
		bobj1.setName(n2);
		
		String a2 = request.getParameter("age2");
		bobj1.setAge(a2);
		
		String g2 = request.getParameter("gender2");
		bobj1.setGender(g2);
		
		
		
		//CREATE OBJECT OF DAO CLASS
		BookDAO bdao = new BookDAO();
		
		boolean f = bdao.insertRecord(bobj);
		boolean f1 = bdao.insertRecord(bobj1);
		boolean f2= bdao.updatePassenger(tid);
		response.setContentType("text/html");
		if(f)
		{
			request.setAttribute("MSG", "BOOKING DONE SUCCESSFULLY");
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeUser.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("ERRORMSG", "SOMETHING WENT WRONG.PLEASE TRY AGAIN");
			RequestDispatcher rd = request.getRequestDispatcher("BookNow.jsp");
			rd.forward(request, response);
		}
	}

}
