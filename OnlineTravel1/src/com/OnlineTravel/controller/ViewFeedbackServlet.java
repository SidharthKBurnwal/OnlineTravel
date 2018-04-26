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
import com.OnlineTravel.logic.FeedbackInfo;


@WebServlet("/ViewFeedbackServlet")
public class ViewFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ViewFeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerDAO cdao = new CustomerDAO();
		ArrayList<FeedbackInfo> feedlist = cdao.displayAllFeedback();
		
		request.setAttribute("flist", feedlist);
		
		RequestDispatcher rd = request.getRequestDispatcher("ViewFeedback.jsp");
		
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
