/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M8
 * Generated at: 2016-07-29 14:25:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.OnlineTravel.logic.CustomerInfo;
import java.util.List;
import java.util.ArrayList;

public final class EditCustomerProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  //DECLARATION TAG
		     // ALL VERIABLE SHOULD BE WRITTEN HERE
		   ArrayList<CustomerInfo> custlist;
		   
		
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.OnlineTravel.logic.CustomerInfo");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write(" \t<meta charset=\"utf-8\">\n");
      out.write("\t    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t    <title>Edit Your Details</title>\n");
      out.write("\t    <link href=\"bootstrap-3.3.6-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t    <link href=\"bootstrap-3.3.6-dist/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("\t    <link href=\"font-awesome-4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\t    <link href=\"bootstrap-social-gh-pages/bootstrap-social.css\" rel=\"stylesheet\">\n");
      out.write("\t    <link href=\"css/booking.css\" rel=\"stylesheet\">\n");
      out.write("\t    <link rel=\"icon\" type=\"png\" href=\"img/tour.ico\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t");

		    custlist = (ArrayList<CustomerInfo>)request.getAttribute("clist");
		     
		
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h1 style=\"text-align: center;\">Edit your details here</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<form action=\"EditCustomerProfileServlet\" method=\"post\" class=\"form-horizontal\"  role=\"form\">\n");
      out.write("\t\t ");

		      for(CustomerInfo cobj : custlist)
		      {
		  
      out.write("\n");
      out.write("\t\t  \t\t<br>\n");
      out.write("\t\t  \t\t<br>\t\n");
      out.write("\t\t  \t\t\t\n");
      out.write("\t\t  \t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-sm-2 col-sm-offset-2\" for=\"name\">Full Name</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" value=");
      out.print( cobj.getName() );
      out.write(" id=\"name\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-sm-2 col-sm-offset-2\" for=\"email\">Email</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" value=");
      out.print( cobj.getEmail() );
      out.write(" id=\"email\" class=\"form-control\" readonly=\"readonly\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-sm-2 col-sm-offset-2\" for=\"pass\">Password</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" value=");
      out.print( cobj.getPassword() );
      out.write(" id=\"pass\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t       <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-sm-2 col-sm-offset-2\" for=\"contact\">Contact</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"number\" value=");
      out.print( cobj.getNumber() );
      out.write(" id=\"contact\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t       <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-sm-2 col-sm-offset-2\" for=\"add\">Address</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"address\" value=");
      out.print(cobj.getAddress() );
      out.write("id=\"add\" class=\"form-control\"></textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t       <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-sm-2 col-sm-offset-2\" for=\"place\">Which kind of place you want to visit?:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t\t<select class=\"form-control\" name=\"place\" id=\"place\">\n");
      out.write("\t\t\t\t\t\t\t\t<option>Hills</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Seaside</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Forest</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Greenery</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option> Religious</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option selected>");
      out.print(cobj.getPlace() );
      out.write("</option>   \n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t       \n");
      out.write("\t\t       ");

		      		}
		  		
      out.write("\n");
      out.write("\t\t  \t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-success btn-md col-sm-offset-4\" value=\"UPDATE\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-info btn-md col-sm-offset-1\" href=\"WelcomeUser.jsp\">Go to Home page</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t   ");

		   	  if(request.getAttribute("MSG") != null)
		   	  {
		   		  out.println("<font color = red size=3>");
		       	  out.println(request.getAttribute("MSG"));
		       	  out.println("</font>");
		       	  out.println("<br>");
		      }
		   
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}