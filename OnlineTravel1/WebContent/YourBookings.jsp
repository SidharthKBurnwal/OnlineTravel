<%@page import="com.OnlineTravel.logic.BookNow"%>
<%@page import="com.OnlineTravel.logic.TourInfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
       <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>YourBookings</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	     <link rel="icon" type="png" href="img/tour.ico">
</head>
<body>

<%!  //DECLARATION TAG
     // ALL VERIABLE SHOULD BE WRITTEN HERE
   ArrayList<BookNow> booklist;
%>

<%
    //SCRIPTLET TAG
    //U CAN WRITE YOUR LOGIC HERE
    booklist = (ArrayList<BookNow>)request.getAttribute("blist");
%>
		<a class="btn btn-info btn-md col-sm-offset-2" href="WelcomeUser.jsp">Go to Home page</a>
		<br>
		<br>
		<div class="table-responsive">
			<table class="table table-bordered table-striped table-hover">
			
			  <tr>
			    <th>BookingId</th>
			    <th>TourId</th>
			    <th>Email</th>
			    <th>Name</th>
			    <th>Age</th>
			    <th>Gender</th>
			    <th>Room</th>
			    <th>Food</th>
			    <th>Payment</th>
			  </tr>
			  
			  <%
			      for(BookNow bobj : booklist)
			      {
			  %>
			   <tr>
			    <td> <%= bobj.getBookingid() %> </td>
			    <td> <%= bobj.getTourid() %> </td>
			    <td> <%= bobj.getEmail() %> </td>
			    <td> <%= bobj.getName() %> </td>  
			    <td> <%= bobj.getAge() %> </td>   
			    <td> <%= bobj.getGender() %> </td>  
			    <td> <%= bobj.getRoom() %> </td>   
			    <td> <%= bobj.getFood() %> </td>   
			    <td> <%= bobj.getPayment() %> </td>         
			  </tr>
			  <%
			      }
			  %>
		  </table>
		</div>
		<a class="btn btn-info btn-md col-sm-offset-2" href="WelcomeUser.jsp">Go to Home page</a>
</body>
</html>