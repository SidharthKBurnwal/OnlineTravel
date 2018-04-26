package com.OnlineTravel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineTravel.dao.CustomerDAO;
import com.OnlineTravel.logic.CustomerInfo;
import com.OnlineTravel.logic.FeedbackInfo;


@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//CREATE OBJECT AND STORE VALUE WITHIN IT
		FeedbackInfo feedobj = new FeedbackInfo(); 
		
		String fname = request.getParameter("firstname");
		feedobj.setFirstname(fname);
		
		String lname = request.getParameter("lastname");
		feedobj.setLastname(lname);
		
		String code = request.getParameter("code");
		feedobj.setCode(code);
		
		String num = request.getParameter("number");
		feedobj.setNumber(num);
		
		String email = request.getParameter("email");
		feedobj.setEmail(email);
		
		String rating = request.getParameter("rating");
		feedobj.setRating(rating);
		
		String feedback = request.getParameter("feedback");
		feedobj.setFeedback(feedback);
		
		//CREATE OBJECT OF DAO CLASS
		CustomerDAO cdao = new CustomerDAO();
		
		boolean f = cdao.insertFeedback(feedobj);
		response.setContentType("text/html");
		
		if(f)
		{
			response.sendRedirect("index2.jsp");

		}
		else
		{
			//If details are wrong go here
			response.sendRedirect("index2.jsp");

			
		}	
		
	}

}
