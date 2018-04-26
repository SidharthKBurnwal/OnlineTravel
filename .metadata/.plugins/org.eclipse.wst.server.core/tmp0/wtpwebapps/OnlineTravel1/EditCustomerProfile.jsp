
<%@page import="com.OnlineTravel.logic.CustomerInfo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
 	<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>Edit Your Details</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/booking.css" rel="stylesheet">
	    <link rel="icon" type="png" href="img/tour.ico">
	</head>
	<body>

		<%!  //DECLARATION TAG
		     // ALL VERIABLE SHOULD BE WRITTEN HERE
		   ArrayList<CustomerInfo> custlist;
		   
		%>
		
		<%
		    custlist = (ArrayList<CustomerInfo>)request.getAttribute("clist");
		     
		%>
		<div class="container">
			<h1 style="text-align: center;">Edit your details here</h1>
		
		<form action="EditCustomerProfileServlet" method="post" class="form-horizontal"  role="form">
		 <%
		      for(CustomerInfo cobj : custlist)
		      {
		  %>
		  		<br>
		  		<br>	
		  			
		  		<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="name">Full Name</label>
						<div class="col-sm-4">
							<input type="text" name="name" value=<%= cobj.getName() %> id="name" class="form-control">
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="email">Email</label>
						<div class="col-sm-4">
							<input type="email" name="email" value=<%= cobj.getEmail() %> id="email" class="form-control" readonly="readonly">
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="pass">Password</label>
						<div class="col-sm-4">
							<input type="password" name="password" value=<%= cobj.getPassword() %> id="pass" class="form-control">
						</div>
				</div>
		       <div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="contact">Contact</label>
						<div class="col-sm-4">
							<input type="text" name="number" value=<%= cobj.getNumber() %> id="contact" class="form-control">
						</div>
				</div>
		       <div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="add">Address</label>
						<div class="col-sm-4">
							<textarea name="address" value=<%=cobj.getAddress() %>id="add" class="form-control"></textarea>
						</div>
				</div>
		       <div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="place">Which kind of place you want to visit?:</label>
						<div class="col-sm-2">
							<select class="form-control" name="place" id="place">
								<option>Hills</option>
								<option>Seaside</option>
								<option>Forest</option>
								<option>Greenery</option>
								<option> Religious</option>
								<option selected><%=cobj.getPlace() %></option>   
							</select>
						</div>
				</div>
		       
		       <%
		      		}
		  		%>
		  		<div class="form-group">
						<input type="submit" class="btn btn-success btn-md col-sm-offset-4" value="UPDATE">
						<a class="btn btn-info btn-md col-sm-offset-1" href="WelcomeUser.jsp">Go to Home page</a>
				</div>
		</form>
	</div>
		
		<div>
		   <%
		   	  if(request.getAttribute("MSG") != null)
		   	  {
		   		  out.println("<font color = red size=3>");
		       	  out.println(request.getAttribute("MSG"));
		       	  out.println("</font>");
		       	  out.println("<br>");
		      }
		   %>
					
		</div>
</body>
</html>