<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>Book your seat now!!</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/booking.css" rel="stylesheet">
	    <link rel="icon" type="png" href="img/tour.ico">
	</head>
	<body>
	
		<div>
			   <%
			   	  if(request.getAttribute("ERRORMSG") != null)
			   	  {
			   		  out.print("<font color = red size=3>");
			       	  out.print(request.getAttribute("ERRORMSG"));
			       	  out.print("</font>");
			       	  out.print("<br>");
			      }
			   %>
		</div>
		
		
		<%!String uid,tid;%>

		<%
			uid=(String)session.getAttribute("uid");
			tid=request.getParameter("tid"); 
			Random r = new Random();
			int x=r.nextInt(60000);
			String bid="B"+x;
		
		%>
		
		
		
		<div class="container">
			<h2 style="text-align: center">Booking Form</h2>
				<br>
				<form class="form-horizontal" action="BookNowServlet" role ="form" method="post">
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="bid">BookingId</label>
						<div class="col-sm-2">
							<input type="text" name="bookingid" id="bid" class="form-control"  value="<%=bid%>" readonly="readonly">
						</div>
					</div>
					
					
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="tid">TourId</label>
						<div class="col-sm-2">
							<input type="text" name="tourid" id="tid" class="form-control"  value="<%=tid%>" readonly="readonly">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="uid">Email</label>
						<div class="col-sm-3">
							<input type="email" name="email" id="uid" class="form-control" value="<%=uid%>" readonly="readonly">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="frstper">First person name</label>
						<div class="col-sm-3">
							<input type="text" name="name1" id="frstper" class="form-control" placeholder="Enter name here!" required>
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="frstage">Age</label>
						<div class="col-sm-2">
							<input type="text" name="age1" id="frstage" class="form-control" placeholder="Enter age" required>
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="frstgender">Gender</label>
						<div class="col-sm-6">
								<label class="radio-inline"><input type="radio" value="Male" name="gender1">Male</label>
								<label class="radio-inline"><input type="radio" value="Female" name="gender1">Female</label>
						</div>	
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="secper">Second person name</label>
						<div class="col-sm-3">
							<input type="text" name="name2" id="secper" class="form-control" placeholder="Enter name here!" required>
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="secage">Age</label>
						<div class="col-sm-2">
							<input type="text" name="age2" id="secage" class="form-control" placeholder="Enter age" required>
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2 col-sm-offset-2" for="secgender">Gender</label>
						<div class="col-sm-6">
								<label class="radio-inline"><input type="radio" value="Male" name="gender2">Male</label>
								<label class="radio-inline"><input type="radio" value="Female" name="gender2">Female</label>
						</div>	
					</div>
					
					<div class="form-group">
					  <label class="control-label col-sm-2 col-sm-offset-2" for="room1">Room Type you will prefer</label>
					  <div class="col-sm-2">
					   <select class="form-control" name="room" id="room11">
						    <option>AC</option>
						    <option>NonAC</option>
					   </select>
					   </div>
					</div>
					
					<div class="form-group">
					  <label class="control-label col-sm-2 col-sm-offset-2" for="foo1">Food type</label>
					  <div class="col-sm-2">
					   <select class="form-control" name="food" id="foo1">
						    <option>Vegetarian</option>
						    <option>Non Vegetarian</option>
					   </select>
					  </div>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success btn-md col-sm-offset-6" value="Book">
						<input type="reset" class="btn btn-warning btn-sm col-sm-offset-2" value="Reset Details">
					</div>
				</form>
		</div>
	
</html>