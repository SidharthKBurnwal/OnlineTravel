<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE htm>
<html>
<head>
<meta charset="utf-8">
		    <meta http-equiv="X-UA-Compatible" content="IE=edge">
		    <meta name="viewport" content="width=device-width, initial-scale=1">
		    <title>UpdatePayment</title>
		    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
		    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
		    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
		    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
		    <link href="css/style.css" rel="stylesheet">
		    <link rel="icon" type="png" href="img/tour.ico">
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
        <form action="PaymentUpdateServlet" role="form">
        	<div class="form-group">
					<label class="control-label col-sm-2" for="bid">Enter Bookingid</label>
						<div class="col-sm-2">
							<input type="text" name="bookingid" id="bid" class="form-control">
						</div>
			</div>
			<div class="form-group">
					<input type="submit" class="btn btn-info btn-md " value="Update Payment">
					<a class="btn btn-warning btn-md col-sm-offset-1" href="WelcomeAdmin.jsp">Home</a>
					
			</div>
 		</form>
 		</div>
</body>
</html>