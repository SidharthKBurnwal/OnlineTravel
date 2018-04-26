<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>SelectTour</title>
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
                      out.print("<font color = green size=3>");
                      out.print(request.getAttribute("ERRORMSG"));
                      out.print("</font>");
                      out.print("<br>");
                  }
               %>
        </div>
        
        <div class="container">
			<form action="SelectTourByTypeServlet" role="form">
				<div class="form-group">
							<label class="control-label col-sm-2 col-sm-offset-1" for="type">Select Tour By Type</label>
								<div class="col-sm-3">
									<select class="form-control" name="type" id="type">
										<option>Hills</option>
										<option>Seaside</option>
										<option>Forest</option>
										<option>Greenery</option> 
										<option>Religious</option>  
										<option>Heritage Places</option>
									</select>
								</div>
					</div>
					<div class="form-group">
							<input type="submit" class="btn btn-danger btn-md col-sm-offset-1" value="Search">
							<a class="btn btn-info btn-md col-sm-offset-2" href="WelcomeUser.jsp">Go to Home page</a>
					</div>
			</form>
		</div>
 
	</body>
</html>