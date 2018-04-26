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
import com.OnlineTravel.logic.CustomerInfo;


@WebServlet("/FetchCustomerProfileServlet")
public class FetchCustomerProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public FetchCustomerProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid = request.getParameter("email");
		CustomerDAO cdao = new CustomerDAO();
		ArrayList<CustomerInfo> custlist = cdao.searchCustomerByEmail(uid);
		
		if(custlist.isEmpty()){
			request.setAttribute("ERRORMSG", "INVALID USERID");
			RequestDispatcher rd= request.getRequestDispatcher("WelcomeUser.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("clist", custlist);
			RequestDispatcher rd = request.getRequestDispatcher("EditCustomerProfile.jsp");
			rd.forward(request, response);	
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
