<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>View Your bookings</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	     <link rel="icon" type="png" href="img/tour.ico">
</head>
<body>
	<%! String email; %>
	<%
		email=(String)session.getAttribute("uid");	
	
	%>
	<div class="container">
		<form action="ViewYourBookingsServlet">
			<div class="form-group">
					<label class="control-label col-sm-2" for="email">Enter your email</label>
							<div class="col-sm-2">
								<input type="text" name="email" value="<%=email%>" readonly="readonly" id="email" class="form-control">
							</div>	
			</div>
			
			<div class="form-group">
							<input type="submit" class="btn btn-info btn-md " value="VIEW">
							
			</div>
		</form>
	</div>
</body>
</html>