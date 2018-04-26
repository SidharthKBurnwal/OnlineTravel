<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		 <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>DeleteTour</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	    <link rel="icon" type="png" href="img/tour.ico">
	</head>
	<body>
		<div>
			<%
				if(request.getAttribute("ERRORMSG") != null)
				{
						out.println("<font color = red size=3>");
						out.println(request.getAttribute("ERRORMSG"));
						out.println("</font>");
						out.println("<br>");
				}%>
		</div>
		<div class="container">
			<form action="DeleteTourServlet">
				<div class="form-group">
						<label class="control-label col-sm-2" for="tid">Enter Tour Id</label>
							<div class="col-sm-2">
								<input type="text" name="id" id="tid" class="form-control" required>
							</div>
				</div>
				<div class="form-group">
						<input type="submit" class="btn btn-danger btn-md " value="Delete">
						<a class="btn btn-success btn-md col-sm-offset-1" href="WelcomeAdmin.jsp">Home</a>
						
				</div>
			</form>
		</div>
	</body>
</html>