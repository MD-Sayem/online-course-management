/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-15 03:42:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import cse.web.Student;
import cse.web.Course;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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
    _jspx_imports_classes.add("cse.web.Course");
    _jspx_imports_classes.add("cse.web.Student");
    _jspx_imports_classes.add("java.io.BufferedReader");
    _jspx_imports_classes.add("java.io.InputStreamReader");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
ArrayList<Course> courseList=(ArrayList<Course>)request.getAttribute("courseList");
      out.write('\n');
Student std = (Student)request.getAttribute("data"); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("	<title>Online Course Registration</title>\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"./public/student.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getAttribute("status") );
      out.write("\" >\n");
      out.write("   <script src=\"vendor/jquery/jquery.min.css\"></script>\n");
      out.write("   <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write(" \n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("		var status=document.getElementById(\"status\").value;\n");
      out.write("		if(status==\"success\"){\n");
      out.write("			swal(\"Congrats\",\"Course Registerd Successfully\", \"success\");\n");
      out.write("		}\n");
      out.write("		else if(status==\"failed\"){\n");
      out.write("			swal(\"Sorry\",\"Course Already Registered\", \"error\");\n");
      out.write("		}\n");
      out.write("\n");
      out.write("	</script>\n");
      out.write("<!-- 	<header>\n");
      out.write("		<nav>\n");
      out.write("			<h1>Student</h1>\n");
      out.write("			<h1>Sirazul_Islam</h1>\n");
      out.write("      <h1> <center>Online Course Registration System</center></h1>\n");
      out.write("      \n");
      out.write("			<a href=\"\">Home</a>\n");
      out.write("			<a href=\"logout\">Logout</a>\n");
      out.write("		</nav>\n");
      out.write("	</header>\n");
      out.write(" -->\n");
      out.write(" <header>\n");
      out.write("		<nav>\n");
      out.write("			\n");
      out.write("			<div class=\"dropdown\">\n");
      out.write("				\n");
      out.write("				<span><h1>Student</h1></span>\n");
      out.write("				<div class=\"dropdown-content\">\n");
      out.write("					<h4>\n");
      out.write("				<p>");
      out.print( session.getAttribute("name"));
      out.write("</p>\n");
      out.write("				<p>");
      out.print( session.getAttribute("reg"));
      out.write("</p>\n");
      out.write("				<!-- <p>Registration: 2018331116</p> -->\n");
      out.write("			</h4>\n");
      out.write("				</div>\n");
      out.write("			  </div>\n");
      out.write("		\n");
      out.write("      <h1> <center>Online Course Registration</center></h1>\n");
      out.write("			<!-- <a href=\"logout\">Logout</a> -->\n");
      out.write("			<button  type=\"submit\" name=\"add-now\" onclick=\"window.location.href='logout';\"><h3> Logout</h3></button>\n");
      out.write("		</nav>\n");
      out.write("	</header>\n");
      out.write("	<main>\n");
      out.write("<!--  		<form>  -->\n");
      out.write("			<h2>Your Courses</h2>\n");
      out.write("			<table class=\"css-serial\">\n");
      out.write("				<thead>\n");
      out.write("					<tr>\n");
      out.write("						<th>SL</th>\n");
      out.write("						<th>Course ID</th>\n");
      out.write("						<th>Course Name</th>\n");
      out.write("						<th>Credit</th>\n");
      out.write("						<th>Course Teacher</th>\n");
      out.write("					</tr>\n");
      out.write("				</thead>\n");
      out.write("        \n");
      out.write("				<tbody>\n");
      out.write("				 \n");
      out.write("			     ");
ArrayList<String> courses=std.getCourses();
			    for(int j=0; j<courseList.size(); j++){
      out.write("\n");
      out.write("			            <tr>\n");
      out.write("			              <td> </td>\n");
      out.write("			              <td>");
      out.print(courseList.get(j).courseId );
      out.write("</td> \n");
      out.write("						  <td>");
      out.print(courseList.get(j).courseName );
      out.write("</td>            \n");
      out.write("			              <td>");
      out.print(courseList.get(j).credit );
      out.write("</td> \n");
      out.write("			              <td>");
      out.print(courseList.get(j).teacherName );
      out.write("</td> \n");
      out.write("			            </tr>\n");
      out.write("			            \n");
      out.write("			\n");
      out.write("				");
}
      out.write("\n");
      out.write("			          \n");
      out.write("<!-- 					<tr>\n");
      out.write("						<td> </td>\n");
      out.write("						<td><input type=\"text\" name=\"course-id\"></td>\n");
      out.write("						<td><input type=\"text\" name=\"course-name\"></td>\n");
      out.write("						<td><input type=\"text\" name=\"credit\"></td>\n");
      out.write("					</tr>   -->\n");
      out.write("                \n");
      out.write("				</tbody>\n");
      out.write("			</table>\n");
      out.write("			<button  type=\"submit\" name=\"add-now\" onclick=\"window.location.href='./registerCourse';\"> <h3>Register New Course</h3></button>\n");
      out.write("		<!--  		</form>  -->\n");
      out.write("</main>\n");
      out.write("\n");
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