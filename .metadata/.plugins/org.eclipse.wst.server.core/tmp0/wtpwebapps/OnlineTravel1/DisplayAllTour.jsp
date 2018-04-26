<%@page import="com.OnlineTravel.logic.TourInfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	 	<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>All Tours</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	    <link rel="icon" type="png" href="img/tour.ico">

	<body>
		<%! String id; %>
		<%
			id=(String)session.getAttribute("id");	
		
		%>
		
		
		<%! 
			ArrayList<TourInfo> tourlist;
		%>
		
		<%
			tourlist = (ArrayList<TourInfo>)request.getAttribute("tlist");
		%>
		<a class="btn btn-primary btn-md col-sm-offset-11" href="WelcomeAdmin.jsp">Home</a>
		<br>
		<br>
	<div class="table-responsive">
		<table class="table table-bordered table-striped table-hover">
			<tr>
				<th>Id</th>
				<th>Type</th>
				<th>Place</th>
				<th>StartDate</th>
				<th>EndDate</th>
				<th>Cost</th>
				<th>Passengers allowed</th>
				<th>Edit Details</th>
			</tr>
			
			<% 
				for(TourInfo tobj : tourlist)
				{
			%>
			<tr>
				<td><%= tobj.getId() %></td>
				<td><%= tobj.getType() %></td>
				<td><%= tobj.getPlace() %></td>
				<td><%= tobj.getStartDate() %></td>
				<td><%= tobj.getEndDate() %></td>
				<td><%= tobj.getCost() %></td>
				<td><%= tobj.getPassenger() %></td>
				<td><a class="btn btn-success" href="FetchTourDetailsServlet?id=<%=tobj.getId()%>">Edit</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
	<a class="btn btn-primary btn-md col-sm-offset-11" href="WelcomeAdmin.jsp">Home</a>
	</body>
</html>