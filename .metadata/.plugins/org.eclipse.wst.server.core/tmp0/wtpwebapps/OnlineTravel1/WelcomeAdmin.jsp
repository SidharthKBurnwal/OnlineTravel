<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>Welcome Admin</title>
	    <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">
	    <link href="bootstrap-social-gh-pages/bootstrap-social.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	     <link rel="icon" type="png" href="img/tour.ico">
	     
	     <!-- Code for Logout -->
	     <script src="jQuery1/jquery.min.js"></script>
	    <script src="jQuery1/jquery-ui.min.js"></script>
	    
	     <script>
	       $(document).ready(function() 
	       {
	          function disableBack() { window.history.forward() }
	
	          window.onload = disableBack();
	          window.onpageshow = function(evt) 
	                              { if (evt.persisted) disableBack() }
	        });
	    </script>
	     
	</head>
	</head>
	<body>
		
        <div>
               <%
                  if(request.getAttribute("ERRORMSG1") != null)
                  {
                      out.print("<font color = red size=3>");
                      out.print(request.getAttribute("ERRORMSG1"));
                      out.print("</font>");
                      out.print("<br>");
                  }
               %>
        </div>
        
         <div>
               <%
                  if(request.getAttribute("MSG1") != null)
                  {
                      out.print("<font color = blue size=3>");
                      out.print(request.getAttribute("MSG1"));
                      out.print("</font>");
                      out.print("<br>");
                  }
               %>
        </div>
		
		
		<%! String id; %>
		<%
		id=(String)session.getAttribute("tid");	
	
		%>
	
	
		<!-- START OF NAVIGATION BAR -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        	<div class="container">
	            <div class="navbar-header">
	                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	                    <span class="sr-only">Toggle navigation</span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                </button>
	               </div>
	                <div id="navbar" class="navbar-collapse collapse">
		                <ul class="nav navbar-nav">
		                    <li class="active">
		                        <a href="WelcomeAdmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a>
		                    </li>
		                    <li>
		                        <a href="about.html"><span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span> About</a>
		                    </li>
		                    <li>
		                        <a href="contact.html"><i class="fa fa-envelope-o"></i> Contact</a>
		                    </li>
		              
                    		<li class="dropdown">
	                        	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
	                        	Update tours<span class="caret"></span></a>
	                        	<ul class="dropdown-menu">
		                           <li><a href="TourInfo.jsp">Add Tours</a></li>
									<li><a href="DeleteTour.jsp">Delete Tour</a></li>
									<li><a href="PaymentUpdate.jsp">Update payment</a></li>
									 <li><a href="TourDetails.jsp">Tour Details</a></li>
							  	<li><a href="ViewFeedbackServlet">View FeedBacks</a></li>
		                            <li role="separator" class="divider"></li>
		                            <li>
			                            <form action="DisplayAllTourServlet">
												<input type="submit" value="DisplayAllTour">
										</form>
									</li>
	                        	 </ul>
                    		</li>
		               </ul>
		                <ul class="nav navbar-nav navbar-right">
		           			 <li><a href="#"  role="button"><span>Hello admin</span></a>
		                      </li>
		                     
		                      <li><a href="index2.jsp">Log Out</a></li>
		                 </ul>
	             </div>
	        </div>
	    </nav>
	    
	    <header class="jumbotron">
        	<div class="container">
        		<div class="row row-header">
        			<div class="col-xs-12 col-sm-8">
        				<h1>Tourister</h1>
        				<p style="padding:40px"></p>
                        <p>We take inspiration from the World's best 
		                    touring experiences, and create a unique experience. You will surely be surprised by our amazing offers and deals we
		                    provide throughout the year !
                    	</p>
                    </div>
             	</div>
            </div>
	</header>


   
        	<div class="row row-content">
        		<div class="col-xs-12">
	        		<div id="mycarousel" class="carousel slide" data-ride="carousel">
	                    <!--Indicators-->
	                    <ol class="carousel-indicators">
	                        <li data-target="#mycarousel" data-slide-to="0" class="active"></li>
	                        <li data-target="#mycarousel" data-slide-to="1"></li>
	                        <li data-target="#mycarousel" data-slide-to="2"></li>
	                        <li data-target="#mycarousel" data-slide-to="3"></li>
	                        <li data-target="#mycarousel" data-slide-to="4"></li>
	                    </ol>
	                    <!--Wrapper for slide-->	
	                 	  <div class="carousel-inner" role="listbox">
                            <div class="item active">
                                <img class="img-responsive" src="img/image1.jpg" alt="Manali">
                                <div class="carousel-caption">
                                      <h3>Manali <span class="label label-danger label-sm">New</span></h3>
                                      <p>The atmosphere in Manali has a touch of Florence and Venice.
                                      		Exclusive deals only at Rs.12000 per head</p>
                                </div>
                            </div>
                            <div class="item">
                                <img class="img-responsive" src="img/image2.jpg" alt="Anjuna Beach Goa">
                                <div class="carousel-caption">
                                      <h3>Anjuna Beach<span class="label label-danger label-sm">Just arrived</span></h3>
                                      <p>One of the most visited places in India
                                      		Deals starting only at Rs.6000 per head
                                      	</p>
                                </div>
                            </div>
                            <div class="item">
                                <img class="img-responsive" src="img/image3.jpg" alt="Forest">
                                <div class="carousel-caption">
                                      <h3>Sundarban<span class="label label-danger label-sm">New</span></h3>
                                      <p>Talk about forest adventures and nothing can beat Sundarban<br>
                                      		Deals starting only at Rs.10000 per person
                                      </p>
                                 </div>
                            </div>
                            <div class="item">
                                <img class="img-responsive" src="img/image4.jpg" alt="Greenery">
                                <div class="carousel-caption">
                                      <h3>Darjeeling<span class="label label-danger label-sm">New</span></h3>
                                      <p style="color: white;">The most beautiful hill station in India 
                                      		Winter Deals starting only at Rs.11000 per head
                                      </p>
                                 </div>
                            </div>
                            <div class="item">
                                <img class="img-responsive" src="img/image5.jpg" style="background-size: 100% 100%;" alt="Religious">
                                 <div class="carousel-caption">
                                      <h3>The Golden Temple<span class="label label-danger label-sm">New</span></h3>
                                      <p style="color: white;">Where the heart meats soul.Get ready for an amazing tour to the land of Punjabis<br>
                                      		Deals starting only at Rs.10000 per head
                                      </p>
                                 </div>
                            </div>	                        <!-- Left and right controls -->
						    <a class="left carousel-control" href="#mycarousel" role="button" data-slide="prev">
						      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						      <span class="sr-only">Previous</span>
						    </a>
						    <a class="right carousel-control" href="#mycarousel" role="button" data-slide="next">
						      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						      <span class="sr-only">Next</span>
						    </a>
	                	</div>
                	</div>
                </div>
            </div>
  
        <footer class="row-footer">
        <div class="container">
            <div class="row">             
                <div class="col-xs-5 col-xs-offset-1 col-sm-2 col-sm-offset-1">
                    <h5>Links</h5>
                    <ul class="list-unstyled">
                        <li><a href="#">Home</a></li>
                        <li><a href="about.html">AboutUs</a></li>
                        <li><a href="contact.html">Contact</a></li>
                    </ul>
                </div>
                <div class="col-xs-6 col-sm-5">
                    <h5>Our Address</h5>
                     <address style="font-size: 100%">
                       243/P, Maniktala main road,<br>
                       Kolkata-54<br>
                      <i class="fa fa-phone"></i>: +91 9804567875<br>
                      <i class="fa fa-fax"></i>: +91 9321891022<br>
                      <i class="fa fa-envelope"></i>: 
                        <a href="mailto:tourister@gmail.com">tourister@gmail.com</a>
                   </address>
                </div>
                <div class="col-xs-12 col-sm-4">
                    <div class="nav navbar-nav" style="padding: 40px 10px;">
                        <a class="btn btn-social-icon btn-google-plus" href="http://google.com/+"><i class="fa fa-google-plus"></i></a>
                        <a class="btn btn-social-icon btn-facebook" href="http://www.facebook.com/profile.php?id="><i class="fa fa-facebook"></i></a>
                        <a class="btn btn-social-icon btn-linkedin" href="http://www.linkedin.com/in/"><i class="fa fa-linkedin"></i></a>
                        <a class="btn btn-social-icon btn-twitter" href="http://twitter.com/"><i class="fa fa-twitter"></i></a>
                        <a class="btn btn-social-icon btn-youtube" href="http://youtube.com/"><i class="fa fa-youtube"></i></a>
                        <a class="btn btn-social-icon" href="mailto:"><i class="fa fa-envelope-o"></i></a>
                    </div>
                </div>
                <div class="col-sm-12">
                        <p style="padding:10px;"></p>
                        <p align=center>&copy; Copyright 2016 Tourister</p>
                </div>
            </div>
        </div>  
    </footer>

     <script src="jquery/dist/jquery.min.js"></script>
        <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
        <!--Adding the javascript code for carousel-->

      </body>
</html>