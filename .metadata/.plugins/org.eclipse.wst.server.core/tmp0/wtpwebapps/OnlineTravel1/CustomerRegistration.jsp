<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US">
	<head>
	     <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>RegistrationForm</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/booking.css" rel="stylesheet">
	    <link rel="icon" type="png" href="img/tour.ico">
	 </head>
	<body>
		<div class="container">
			<h1 style="text-align: center;">Sign up for an free account</h1>
				<br>
				<form class="form-horizontal" action="CustomerRegistrationServlet" method="post" role="form">
			
				<div class="form-group">
					<label class="control-label col-sm-2" for="name">Full Name</label>
						<div class="col-sm-4">
							<input type="text" name="name" id="name" class="form-control" placeholder="Enter your name" required>
						</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Email</label>
						<div class="col-sm-4">
							<input type="email" name="email" id="email" class="form-control" placeholder="Enter your email address" required>
						</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Password</label>
						<div class="col-sm-2">
							<input type="password" name="password" id="pwd" class="form-control" required>
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="contact">Contact</label>
						<div class="col-sm-2">
							<input type="text" name="number" id="contact" class="form-control" placeholder="Enter your contact no." required>
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="add">Address</label>
						<div class="col-sm-3">
							<textarea name="address" id="add" class="form-control" required></textarea>
						</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="place">Which kind of place you want to visit?:</label>
						<div class="col-sm-2">
							<select class="form-control" name="place" id="place" required>
								<option>Hills</option>
								<option>Seaside</option>
								<option>Forest</option>
								<option>Greenery</option>
								<option> Religious</option>
							</select>
						</div>
				</div>
				<br>
				<br>
				<div class="form-group">
						<input type="submit" class="btn btn-success btn-md col-sm-offset-3" value="Sign up">
						<input type="reset" class="btn btn-warning btn-sm col-sm-offset-2" value="Reset Details">
				</div>
		</form>
		</div>
	</body>
	
</html>