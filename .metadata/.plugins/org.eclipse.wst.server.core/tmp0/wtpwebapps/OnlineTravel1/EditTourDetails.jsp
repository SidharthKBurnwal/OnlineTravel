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
		    <title>Edit Tour Details</title>
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
		   ArrayList<TourInfo> tourlist;
		   
		%>
		
		<%
		    tourlist = (ArrayList<TourInfo>)request.getAttribute("tlist");
		     
		%>
		<div class="container">
			<h1 style="text-align: center;">Edit Tour details</h1>
		
		<form action="EditTourDetailsServlet" method="post" class="form-horizontal"  role="form">
		  
		  <%
		      for(TourInfo tobj : tourlist)
		      {
		  %>
			<br>
		  		<br>	
		  			
		  		<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="tid">Tour Id</label>
						<div class="col-sm-4">
							<input type="text" name="id" value=<%= tobj.getId() %> id="tid" class="form-control" readonly="readonly">
						</div>
				</div>
				
				
				 <div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="type">Type</label>
						<div class="col-sm-2">
							<select class="form-control" name="type" id="type">
								<option>Hills</option>
								<option>Seaside</option>
								<option>Forest</option>
								<option>Greenery</option>
								<option> Religious</option>
								<option selected><%=tobj.getType() %></option>   
							</select>
						</div>
				 </div>
				
					
		  		<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="place">Place</label>
						<div class="col-sm-4">
							<input type="text" name="place" value=<%= tobj.getPlace() %> id="place" class="form-control">
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="start">Start date</label>
						<div class="col-sm-4">
							<input type="date" name="startDate" value=<%= tobj.getStartDate() %> id="start" class="form-control">
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="end">End date</label>
						<div class="col-sm-4">
							<input type="date" name="endDate" value=<%= tobj.getEndDate() %> id="end" class="form-control">
						</div>
				</div>
			
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="cost">Cost per Passenger</label>
						<div class="col-sm-4">
							<input type="text" name="cost" value=<%= tobj.getCost() %> id="cost" class="form-control">
						</div>
				</div>
		 		
		 		
		 		<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="passenger">Total Passengers allowed</label>
						<div class="col-sm-4">
							<input type="text" name="passenger" value=<%= tobj.getPassenger() %> id="passenger" class="form-control">
						</div>
				</div>
		       
		       <%
		      		}
		 	   %>
		 	   
		 	   	<div class="form-group">
						<input type="submit" class="btn btn-success btn-md col-sm-offset-6" value="EDIT DETAILS">
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