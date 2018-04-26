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
	    <title>ToursByType</title>
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
   ArrayList<TourInfo> tourlist;
%>

<%
    //SCRIPTLET TAG
    //U CAN WRITE YOUR LOGIC HERE
    tourlist = (ArrayList<TourInfo>)request.getAttribute("tlist");
%>

	<div class="col-xs-12">
		<h2>Find your wishing Travel Deal Here (Classified by Type)</h2>

		<div class="table-responsive">
			<table class="table table-bordered table-striped table-hover">
			
			  <tr>
			    <th>ID</th>
			    <th>Type</th>
			    <th>Place</th>
			    <th>StartDate</th>
			    <th>EndDate</th>
			    <th>Cost</th>
			    <th>Passengers</th>
			    <th>Book Here!!!</th>
			  </tr>
			  
			  <%
			      for(TourInfo tobj : tourlist)
			      {
			  %>
			   <tr>
			    <td> <%= tobj.getId() %> </td>
			    <td> <%= tobj.getType() %> </td>
			    <td> <%= tobj.getPlace() %> </td>
			    <td> <%= tobj.getStartDate() %> </td>  
			    <td> <%= tobj.getEndDate() %> </td>   
			    <td> <%= tobj.getCost() %> </td>  
			    <td> <%= tobj.getPassenger() %> </td>   
			    <td><a class="btn btn-success" href="BookNow.jsp?tid=<%=tobj.getId()%>">BookNow</a></td>        
			  </tr>
			  <%
			      }
			  %>
		  </table>
		</div>
	</div>

</body>
</html>