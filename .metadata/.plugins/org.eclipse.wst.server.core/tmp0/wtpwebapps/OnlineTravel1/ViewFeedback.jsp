<%@page import="com.OnlineTravel.logic.FeedbackInfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>ViewFeedback</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	     <link rel="icon" type="png" href="img/tour.ico">
	</head>
	<body>
		<%! 
			ArrayList<FeedbackInfo> feedlist;
		%>
		
		<%
			feedlist = (ArrayList<FeedbackInfo>)request.getAttribute("flist");
		%>
			<a class="btn btn-primary btn-md col-sm-offset-11" href="WelcomeAdmin.jsp">Home</a>
			<br>
			<br>
			<div class="table-responsive">
			<table class="table table-bordered table-striped table-hover">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Area Code</th>
				<th>Contact</th>
				<th>Email</th>
				<th>Rating</th>
				<th>Feedback</th>
			</tr>
			
			<% 
				for(FeedbackInfo fobj : feedlist)
				{
			%>
			<tr>
				<td><%= fobj.getFirstname() %></td>
				<td><%= fobj.getLastname() %></td>
				<td><%= fobj.getCode() %></td>
				<td><%= fobj.getNumber() %></td>
				<td><%= fobj.getEmail() %></td>
				<td><%= fobj.getRating() %></td>
				<td><%= fobj.getFeedback() %></td>
			</tr>
			<%
				}
			%>
		</table>
		</div>
			<a class="btn btn-primary btn-md col-sm-offset-11" href="WelcomeAdmin.jsp">Home</a>
	</body>
</html>