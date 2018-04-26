<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
		<div class="container">
		<h1 style="text-align: center;">Add Tour</h1>
		<br>
		<br>
		<form action="AddTourServlet" method="post" class="form-horizontal" role="form">
		
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="tid">Tour Id</label>
						<div class="col-sm-4">
							<input type="text" name="id" id="tid" class="form-control">
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="type">Type</label>
						<div class="col-sm-4">
							<select class="form-control" name="type" id="type">
								<option>Hills</option>
								<option>Seaside</option>
								<option>Forest</option>
								<option>Greenery</option>
								<option> Religious</option> 
								<option>Heritage Places</option>
							</select>
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="place">Place</label>
						<div class="col-sm-4">
							<select class="form-control" name="place" id="place">
										<option>Sundarban</option>
										<option>Shimla</option>
										<option>Assam</option>
										<option>Haji Ali</option>
										<option>Darjeeling</option>
										<option>Jaipur</option>
										<option>Golden Temple</option>
										<option>Goa</option>
										<option>Agra</option>
										<option>Puri</option>
										<option>Kashmir</option>
										<option>Manali</option>
							</select>
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="start">Start date</label>
						<div class="col-sm-4">
							<input type="date" name="startDate" id="start" class="form-control" required="required">
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="end">End date</label>
						<div class="col-sm-4">
							<input type="date" name="endDate"  id="end" class="form-control" required="required">
						</div>
				</div>
			
				<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="cost">Cost per Passenger</label>
						<div class="col-sm-4">
							<input type="text" name="cost" id="cost" class="form-control" required="required">
						</div>
				</div>
		 		
		 		
		 		<div class="form-group">
					<label class="control-label col-sm-2 col-sm-offset-2" for="passenger">Total Passengers allowed</label>
						<div class="col-sm-4">
							<input type="text" name="passenger" id="passenger" class="form-control" required="required">
						</div>
				</div>
		       
				 	<div class="form-group">
						<input type="submit" class="btn btn-success btn-md col-sm-offset-4" value="ADD TOUR">
						<a class="btn btn-warning btn-md col-sm-offset-2" href="WelcomeAdmin.jsp">Home</a>
					</div>
		</form>
		</div>
	</body>
</html>